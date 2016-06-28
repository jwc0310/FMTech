import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.libraries.social.poll.impl.PollOptionVoterListPagerActivity;
import java.text.NumberFormat;
import java.util.ArrayList;

public final class jvo
  extends ci
{
  private final ArrayList<jvp> b;
  private final Context c;
  
  public jvo(Context paramContext, bw parambw, ArrayList<jvp> paramArrayList)
  {
    super(parambw);
    this.c = paramContext;
    this.b = paramArrayList;
  }
  
  public final bk a(int paramInt)
  {
    jvj localjvj = new jvj();
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("poll_option_voters", ((jvp)this.b.get(paramInt)).d);
    localjvj.f(localBundle);
    return localjvj;
  }
  
  public final int b()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public final CharSequence b(int paramInt)
  {
    jvp localjvp = (jvp)this.b.get(paramInt);
    String str = TextUtils.htmlEncode(localjvp.a);
    Resources localResources = this.c.getResources();
    int i = eyg.aL;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = PollOptionVoterListPagerActivity.e.format(localjvp.b);
    arrayOfObject[1] = PollOptionVoterListPagerActivity.d.format(localjvp.c);
    arrayOfObject[2] = str;
    return Html.fromHtml(localResources.getString(i, arrayOfObject));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvo
 * JD-Core Version:    0.7.0.1
 */