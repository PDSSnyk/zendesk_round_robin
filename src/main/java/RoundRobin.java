import com.zendesk.BasicAuthenticationHandler;
import com.zendesk.ZendeskClient;

/**
 * Created by ahmad.hassan on 21/10/15.
 */

public class RoundRobin {
    public static void main(String args[]) {
        ZendeskClient.setDebug(true);
        //Logger.setLoggable(true);
        ZendeskClient client = new ZendeskClient.Builder().setBaseUrl("https://olacabs-dev1.zendesk.com").setAuthenticationHandler(new BasicAuthenticationHandler("Removed", "Removed")).build();
        // TicketProvider is one of the many providers in the provider package
        // TicketProvider ticketProvider = new TicketProvider(client.getAdapter()); ticketProvider.getTicketById(1234L, new ZendeskCallback() { @Override public void onSuccess(TicketWrapper ticketWrapper) {
        // We have the ticket } @Override public void onError(ErrorResponse errorResponse) { Logger.e("Sample", errorResponse); } });
        // } }
    }

}