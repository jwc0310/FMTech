import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class jto
{
  public jto(jwe paramjwe) {}
  
  public void a(hae paramhae)
  {
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      jxn.a(this.a.b).a(this.a.b.getString(eyg.ax));
      return;
    }
    Bundle localBundle = paramhae.a();
    jvn localjvn = new jvn(this.a.b);
    ArrayList localArrayList = localBundle.getParcelableArrayList("poll_option_voter_models");
    localjvn.a.putExtra("poll_option_voter_models", localArrayList);
    int j = this.a.f.c();
    localjvn.a.putExtra("account_id", j);
    int k = localBundle.getInt("poll_option_voters_count");
    localjvn.a.putExtra("poll_option_voters_count", k);
    long l = this.a.c.e;
    localjvn.a.putExtra("poll_number_of_votes", l);
    if (efj.L(this.a.b))
    {
      int m = ((View)this.a.c().getParent()).getMeasuredWidth();
      localjvn.a.putExtra("card_width", m);
    }
    this.a.b.startActivity(localjvn.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jto
 * JD-Core Version:    0.7.0.1
 */