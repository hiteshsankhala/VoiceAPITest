
	package ClickSend;

	import java.util.Arrays;
	import java.util.List;
	import ClickSend.Api.VoiceApi;
	import ClickSend.Model.VoiceMessage;
	import ClickSend.Model.VoiceMessageCollection;

	public class send_voice_msg {
	  public static void main(String[] args) {
	    ApiClient defaultClient = new ApiClient();
	    defaultClient.setUsername("Username");
	    defaultClient.setPassword("APIkey");
	    VoiceApi apiInstance = new VoiceApi(defaultClient);
	    VoiceMessage voiceMessage=new VoiceMessage();
	    voiceMessage.to("+918446766888");
	    voiceMessage.body("Hi Eva Speaking");
	    voiceMessage.voice("female");
	    voiceMessage.customString("testing");
	    voiceMessage.country("india");
	    voiceMessage.source("java");
	    voiceMessage.listId(new Integer(185161));
	    voiceMessage.lang("lang");
	    List<VoiceMessage> voiceMessageList=Arrays.asList(voiceMessage);
	    // VoiceMessageCollection | VoiceMessageCollection model
	    VoiceMessageCollection voiceMessages = new VoiceMessageCollection(); 
	    voiceMessages.messages(voiceMessageList);
	    try {
	        String result = apiInstance.voiceSendPost(voiceMessages);
	        System.out.println(result);
	    } catch (ApiException e) {
	        System.err.println("Exception when calling VoiceApi#voiceSendPost");
	        e.printStackTrace();
	    }
	  }
	}

