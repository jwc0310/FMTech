import android.content.Context;
import android.os.Bundle;

final class dab
  extends gzf
{
  private dam a;
  private int b;
  
  public dab(Context paramContext, String paramString, dam paramdam, int paramInt)
  {
    super(paramContext, paramString);
    this.a = paramdam;
    this.b = paramInt;
  }
  
  protected final hae a()
  {
    Bundle localBundle = new Bundle();
    String str1 = this.a.b;
    daa localdaa;
    boolean bool;
    if (str1 != null)
    {
      try
      {
        if (!this.a.a()) {
          break label345;
        }
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        Context localContext2 = this.e;
        kbu localkbu2 = (kbu)mbb.a(localContext2, kbu.class);
        localdaa = new daa(localContext2, this.b, str1);
        localkbu2.a(localdaa);
        if ((!localdaa.n()) && (localdaa.h() != null)) {
          break label171;
        }
        if (!(localdaa.q instanceof kdd)) {
          break label160;
        }
        throw new czy(aau.lK);
      }
      catch (czy localczy)
      {
        bool = false;
        localBundle.putInt("error", localczy.a);
      }
      hae localhae = new hae(bool);
      localhae.a().putAll(localBundle);
      return localhae;
      label160:
      throw new czy(aau.lB);
    }
    label171:
    label345:
    for (String str4 = localdaa.h();; str4 = str1)
    {
      localBundle.putString("profile_id", str4);
      for (String str2 = str4;; str2 = null)
      {
        if ((str2 != null) && (this.a.d != null))
        {
          String str3 = this.a.d;
          efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
          Context localContext1 = this.e;
          kbu localkbu1 = (kbu)mbb.a(localContext1, kbu.class);
          czz localczz = new czz(localContext1, this.b, str2, str3);
          localkbu1.a(localczz);
          if ((localczz.n()) || (localczz.h() == null))
          {
            localczz.c("EsIntentRedirector");
            if ((localczz.q instanceof kdd)) {
              throw new czy(aau.lI);
            }
            throw new czy(aau.lB);
          }
          localBundle.putString("activity_id", localczz.h());
        }
        bool = true;
        break;
      }
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.jp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dab
 * JD-Core Version:    0.7.0.1
 */