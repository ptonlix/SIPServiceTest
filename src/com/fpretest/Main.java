package com.fpretest;

import com.fpretest.UnRegistrar.*;

public class Main
{
	public static void main(String []args)
	{
		UnRegistrar test = new UnRegistrar("192.168.10.111", "192.168.10.20", 1666);
		//UnRegistrar test = new UnRegistrar("192.168.10.111", "192.168.10.26", 1688);
		try {
			
			//test.action("18910000008;123456", "10000", 100000, Command.FpreShared, 90000, 1);
			//test.action("200002", "10022", Command.SendMsg);
			new Thread(test).start();
			test.action("18910000002;123456", "10000", 5000, Command.Callee, "18910000001", 10002);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}