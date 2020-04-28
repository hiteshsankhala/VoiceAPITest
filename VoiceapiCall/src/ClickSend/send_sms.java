package ClickSend;

import java.util.Arrays;
import java.util.List;

import ClickSend.Api.SmsApi;
import ClickSend.Model.SmsMessage;
import ClickSend.Model.SmsMessageCollection;

public class send_sms {
	 public static void main(String[] args) {
		    ApiClient defaultClient = new ApiClient();
		    defaultClient.setUsername("hitesh141292@gmail.com");
		    defaultClient.setPassword("667CEE3E-A34D-B998-1058-087E6ABD46DA");
		    SmsApi apiInstance = new SmsApi(defaultClient);

		    SmsMessage smsMessage=new SmsMessage();
		    smsMessage.body("Hey Hitesh This Side");
		    smsMessage.to("+918446766888");
		    smsMessage.source("java");

		    List<SmsMessage> smsMessageList=Arrays.asList(smsMessage);
		    // SmsMessageCollection | SmsMessageCollection model
		    SmsMessageCollection smsMessages = new SmsMessageCollection();
		    smsMessages.messages(smsMessageList);
		    try {
		        String result = apiInstance.smsSendPost(smsMessages);
		        System.out.println(result);
		    } catch (ApiException e) {
		        System.err.println("Exception when calling SmsApi#smsSendPost");
		        e.printStackTrace();
		    }
		  }

}
