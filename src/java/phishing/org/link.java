/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishing.org;

/**
 *
 * @author WELCOME
 */
import java.util.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class link
{
    public int linkguard1(String a_link,String v_link)
    {
        int flag=linkguard(a_link,v_link);
        if(flag==0)
            return 0;
	else if(flag==-1)
            return -1;
	else
            return 1;
    }
 	public static int linkguard(String a_link,String v_link)
	{
		System.out.println("linkguard()kurmi");
		String str="//";
		if(a_link.indexOf("@")!=-1)
			return 1;
		if(a_link.indexOf("https://")!=-1&&a_link.length()>=8)
		{
			if(a_link.substring(8).indexOf("//")!=-1)
				return 1;
		}
		else if(a_link.indexOf("http://")!=-1&&a_link.length()>=7)
		{
			if(a_link.substring(7).indexOf("//")!=-1)
				return 1;
		}
		// System.out.println(a_link+"   "+v_link);
		if(a_link.indexOf("http://")==-1&&a_link.indexOf("https://")==-1&&a_link.indexOf("//")!=-1)
			return 1;
		a_link=DNS(a_link);
		v_link=DNS(v_link);
		
		if((a_link.equals("empty")==false&&v_link.equals("empty")==false)&&a_link.equals(v_link)!=true)
			return 1;
		boolean flag=dotted_decimal(a_link);
		if(flag)
			return 1;
		else
		{
			flag=check_ip(a_link);
			if(!flag)
				return 1;
			return AnalyzeDNS(a_link,v_link);
		}
		// int flag=check_ip(a_link,v_link);
		// if(flag==)
	}
	public static int AnalyzeDNS(String a_link,String v_link)
	{
		//Apply black list and white list here
		System.out.println("AnalyzeDNS()");
		return 0;
	}
	public static String  DNS(String link)
	{	
		try
		{
			System.out.println("DNS()");
			if(link.indexOf("www")!=-1&& link.length()<=4)
				return "blacklist";
			String temp[]=link.split("/");
			if(link.indexOf("http://")==-1&&link.indexOf("https://")==-1)
				link=temp[0];
			else if(temp.length>=2)
				link=temp[2];
			if(link.indexOf("www")!=-1 && link.charAt(3)=='.')
				link=link.substring(4);
			return link;
		}
		catch(Exception e)
		{
			System.out.println("DNS() Catch");
			return "blacklit";
		}
	}
	public static boolean check_ip(String a_link)
	{
		System.out.println("check_ip()");
		try 
		{
			System.out.println(a_link);
			InetAddress host1 = InetAddress.getByName(a_link);
			String ip_a=host1.getHostAddress();
			return true;
		}
		catch (UnknownHostException ex)
		{
			//System.out.println("check_ip() catch");
			return false;
			//System.out.println("Phishing page");
			//ex.printStackTrace();
		}
	}
	public static boolean dotted_decimal(String a_link)
	{
		System.out.println("dotted()");
		String temp[];
		temp=a_link.split("/");
		if(a_link.indexOf("http://")==-1)
			a_link=temp[0];
		else if(temp.length>=2)
			a_link=temp[2];
		temp=a_link.split("[.]");
		a_link=String.join("",temp);
		return a_link.matches("[0-9]+");

	}
}