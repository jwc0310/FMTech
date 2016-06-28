import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;

public final class bnv
  extends bno
{
  private String l;
  private String m;
  private ArrayList<String> n;
  private lnr o;
  
  bnv(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3, ArrayList<String> paramArrayList4, boolean paramBoolean, String paramString5, String paramString6) {}
  
  protected final void a(hae paramhae)
  {
    Bundle localBundle = paramhae.a();
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    if (this.c != null) {
      localBundle.putParcelableArrayList("extra_added_circles", efj.a(localContext, this.a, this.c));
    }
    if (this.d != null) {
      localBundle.putParcelableArrayList("extra_removed_circles", efj.a(localContext, this.a, this.d));
    }
    if (this.n != null) {
      localBundle.putParcelableArrayList("extra_selected_circles", efj.a(localContext, this.a, this.n));
    }
    localBundle.putString("extra_activity_id", this.l);
    localBundle.putString("extra_suggestion_id", this.m);
  }
  
  protected final void d()
  {
    int i = this.a;
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    this.o = lnr.a(efj.a(this.e, i, this.l));
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    lnr locallnr = lnr.a(efj.a(this.e, i, this.l));
    Context localContext;
    String str;
    if (locallnr.a(this.b, this.m))
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      localContext = this.e;
      str = this.l;
    }
    try
    {
      efj.a(localContext, i, str, lnr.a(locallnr));
      return;
    }
    catch (IOException localIOException) {}
  }
  
  protected final void e()
  {
    int i = this.a;
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    String str = this.l;
    lnr locallnr = this.o;
    try
    {
      efj.a(localContext, i, str, lnr.a(locallnr));
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnv
 * JD-Core Version:    0.7.0.1
 */