package com.elasticTest;

import java.io.IOException;
import com.elasticTest.TargetModel;


public class MainClass {
	
	public static void main(String[] args) throws IOException {
		IndexTargetModel itm = new IndexTargetModel();
		itm.throwToElastic(new TargetModel("Raja", "rajatpawar@hotmail.com"));
		
		itm.closeNode();
	}

}
