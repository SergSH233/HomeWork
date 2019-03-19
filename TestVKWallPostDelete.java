package PWTCurse.Task23;

import static org.junit.Assert.*;


import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestVKWallPostDelete {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void postDelete() throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		 URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
         builder.setParameter("access_token", "c09e7186697d9cc683f9f0430e4a4c46c669eb31f64f1254321033acd10dacb566d892b2e94e0b23fc71b")
         .setParameter("owner_id", "41721885")
         .setParameter("post_id", "207")
         .setParameter("v", "5.92");
         HttpGet request = new HttpGet(builder.build());
         HttpResponse response = client.execute(request);
         assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
         System.out.println(EntityUtils.toString(response.getEntity())); 
	}
}
