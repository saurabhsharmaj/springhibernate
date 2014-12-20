
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ClientResponse SendSimpleMessage() {
	    Client client = Client.create();
	    client.addFilter(new HTTPBasicAuthFilter("api",
	                "key-3f06617253f92c0562c4df1170ad69b8"));
	    WebResource webResource =
	        client.resource("https://api.mailgun.net/v2/sandbox7e840fd3b1bd4fc3885cc165fcaca106.mailgun.org/messages");
	    MultivaluedMapImpl formData = new MultivaluedMapImpl();
	    formData.add("from", "Mailgun Sandbox <postmaster@sandbox7e840fd3b1bd4fc3885cc165fcaca106.mailgun.org>");
	    formData.add("to", "saurabh <saurabh.find@gmail.com>");
	    formData.add("subject", "Hello saurabh");
	    formData.add("text", "Congratulations saurabh, you just sent an email with Mailgun!  You are truly awesome!  You can see a record of this email in your logs: https://mailgun.com/cp/log .  You can send up to 300 emails/day from this sandbox server.  Next, you should add your own domain so you can send 10,000 emails/month for free.");
	    return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
	                                                post(ClientResponse.class, formData);
	}
	    

}
