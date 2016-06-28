import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class jkw
  extends jhu
{
  public static void a(bk parambk, int paramInt, String paramString, Bundle paramBundle)
  {
    bz localbz = parambk.x;
    if ((bj)localbz.a(paramString) == null)
    {
      bp localbp = parambk.f();
      if (localbp != null)
      {
        jkw localjkw = new jkw();
        if (paramBundle == null) {
          paramBundle = new Bundle();
        }
        paramBundle.putInt("account_id", paramInt);
        localjkw.f(paramBundle);
        localjkw.n = parambk;
        localjkw.p = 0;
        localjkw.a(localbz, paramString);
        ((jia)mbb.a(localbp, jia.class)).a(localbp, paramInt);
        jlx localjlx = new jlx(localbp, paramInt);
        localjlx.a = true;
        gzj.a(localbp, localjlx);
      }
    }
  }
  
  protected final Uri a(String paramString)
  {
    return Uri.parse(paramString);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
    int i = this.m.getInt("account_id", -1);
    localBuilder.setTitle(eb.i);
    localBuilder.setPositiveButton(eb.c, this);
    localBuilder.setCancelable(true);
    View localView = LayoutInflater.from(localbp).inflate(aau.AE, null);
    TextView localTextView1 = (TextView)localView.findViewById(efj.Sd);
    String str1 = localbp.getString(eb.g);
    String str2 = localbp.getString(eb.h);
    String str3 = localbp.getString(eb.f);
    SpannableString localSpannableString = new SpannableString(str3);
    Intent localIntent = ((jye)mbb.a(localbp, jye.class)).b(localbp, i);
    localSpannableString.setSpan(new lxv(f(), localIntent), 0, str3.length(), 33);
    TextView localTextView2 = (TextView)localView.findViewById(efj.Se);
    TextView localTextView3 = (TextView)localView.findViewById(efj.Sf);
    localTextView1.setText(str1);
    localTextView2.setText(localSpannableString);
    localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    localTextView2.setClickable(true);
    localTextView2.setVisibility(0);
    localTextView3.setText(str2);
    localTextView3.setVisibility(0);
    v();
    localBuilder.setView(localView);
    return localBuilder.create();
  }
  
  protected final void v()
  {
    a(f().getString(eb.a), efj.a(f(), "circles_add", "https://support.google.com/plus/?hl=%locale%").toString());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkw
 * JD-Core Version:    0.7.0.1
 */