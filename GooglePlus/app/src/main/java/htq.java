import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.debug.settings.DeveloperSettingsActivity;

public final class htq
  extends kft
{
  public htq(DeveloperSettingsActivity paramDeveloperSettingsActivity, tt paramtt, mek parammek)
  {
    super(paramtt, parammek);
  }
  
  protected final kfb a()
  {
    Intent localIntent = this.a.getIntent();
    htr localhtr = new htr();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("args_browse_experiments_intent", localIntent.getParcelableExtra("args_browse_experiments_intent"));
    localBundle.putParcelable("args_account_status_intent", localIntent.getParcelableExtra("args_account_status_intent"));
    localBundle.putParcelable("args_network_requests_intent", localIntent.getParcelableExtra("args_network_requests_intent"));
    localBundle.putParcelable("args_network_stats_intent", localIntent.getParcelableExtra("args_network_stats_intent"));
    localBundle.putParcelable("extra_upload_stats_intent", localIntent.getParcelableExtra("extra_upload_stats_intent"));
    localBundle.putBoolean("args_show_apiary_pref", localIntent.getBooleanExtra("args_show_apiary_pref", true));
    localBundle.putBoolean("args_show_datamixer_pref", localIntent.getBooleanExtra("args_show_datamixer_pref", true));
    localBundle.putBoolean("args_show_override_pref", localIntent.getBooleanExtra("args_show_override_pref", true));
    localBundle.putParcelable("args_show_tracing_pref", localIntent.getParcelableExtra("args_show_tracing_pref"));
    localhtr.f(localBundle);
    return localhtr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htq
 * JD-Core Version:    0.7.0.1
 */