package com.elasticTest;

import static org.elasticsearch.common.xcontent.XContentFactory.*;
import static org.elasticsearch.node.NodeBuilder.*;

import java.io.IOException;
import java.util.Date;


import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

public class IndexTargetModel {
	
	Client client;
	Node node;
	
	public IndexTargetModel() {
		
		
		node = nodeBuilder().clusterName("elasticsearch").node();
		client = node.client();
		
	}
	
	
	public void throwToElastic(TargetModel inputTargetModel) throws IOException{
		
		
		IndexResponse response = client.prepareIndex("ache", "pages", "55")
		        .setSource(inputTargetModel.getJSON())
		        .execute()
		        .actionGet();
	}
	
	public void closeNode() {
		node.close();
	}

}
