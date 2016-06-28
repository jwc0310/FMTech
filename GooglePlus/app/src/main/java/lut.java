import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class lut
  extends mby
  implements DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener
{
  public luu ab;
  
  public static lut a(String paramString1, CharSequence paramCharSequence, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    return new lut().b(paramString1, paramCharSequence, paramString2, paramString3, paramInt1, paramInt2);
  }
  
  public static lut a(String paramString, String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    if (paramString != null) {
      localBundle.putString("title", paramString);
    }
    if (paramArrayOfString != null) {
      localBundle.putStringArray("list", paramArrayOfString);
    }
    lut locallut = new lut();
    locallut.f(localBundle);
    return locallut;
  }
  
  public static lut b(String paramString1, CharSequence paramCharSequence, String paramString2, String paramString3)
  {
    return a(paramString1, paramCharSequence, paramString2, paramString3, 0, 0);
  }
  
  private final luu w()
  {
    if (this.ab != null) {
      return this.ab;
    }
    if ((this.n instanceof luu)) {
      return (luu)this.n;
    }
    if ((f() instanceof luu)) {
      return (luu)f();
    }
    return null;
  }
  
  public Context ar_()
  {
    return f();
  }
  
  public final lut b(String paramString1, CharSequence paramCharSequence, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    if (paramString1 != null) {
      localBundle.putString("title", paramString1);
    }
    if (paramCharSequence != null) {
      localBundle.putCharSequence("message", paramCharSequence);
    }
    if (paramString2 != null) {
      localBundle.putString("positive", paramString2);
    }
    if (paramString3 != null) {
      localBundle.putString("negative", paramString3);
    }
    if (paramInt1 != 0) {
      localBundle.putInt("icon", paramInt1);
    }
    if (paramInt2 != 0) {
      localBundle.putInt("icon_attribute", paramInt2);
    }
    f(localBundle);
    return this;
  }
  
  public Dialog c(Bundle paramBundle)
  {
    localBundle = this.m;
    Context localContext = ar_();
    localun = new un(localContext);
    if (localBundle.containsKey("title"))
    {
      String str = localBundle.getString("title");
      localun.a.e = str;
    }
    if (localBundle.containsKey("message")) {
      localCharSequence = localBundle.getCharSequence("message");
    }
    for (;;)
    {
      try
      {
        View localView = LayoutInflater.from(localContext).inflate(efj.ZP, null);
        localTextView = (TextView)localView.findViewById(aw.eI);
        if (localTextView != null)
        {
          if (!(localCharSequence instanceof String)) {
            continue;
          }
          efj.a(localTextView, (Spannable)Html.fromHtml((String)localCharSequence));
        }
        localun.a(localView);
      }
      catch (Exception localException)
      {
        TextView localTextView;
        int j;
        TypedValue localTypedValue;
        String[] arrayOfString;
        Log.e("AlertFragmentDialog", "Cannot inflated view", localException);
        localun.a.g = localCharSequence;
        continue;
        if (!localBundle.containsKey("icon")) {
          continue;
        }
        int i = localBundle.getInt("icon");
        localun.a.c = i;
        continue;
        boolean[] arrayOfBoolean = new boolean[arrayOfString.length];
        continue;
      }
      if (localBundle.containsKey("positive")) {
        localun.a(localBundle.getString("positive"), this);
      }
      if (localBundle.containsKey("negative")) {
        localun.b(localBundle.getString("negative"), this);
      }
      if ((!localBundle.containsKey("icon_attribute")) || (Build.VERSION.SDK_INT < 11)) {
        continue;
      }
      j = localBundle.getInt("icon_attribute");
      localTypedValue = new TypedValue();
      localun.a.a.getTheme().resolveAttribute(j, localTypedValue, true);
      localun.a.c = localTypedValue.resourceId;
      if (localBundle.containsKey("list")) {
        localun.a(localBundle.getStringArray("list"), this);
      }
      if (localBundle.containsKey("multi_choice_list"))
      {
        arrayOfString = localBundle.getStringArray("multi_choice_list");
        if (!localBundle.containsKey("multi_choice_list_states")) {
          continue;
        }
        arrayOfBoolean = localBundle.getBooleanArray("multi_choice_list_states");
        localun.a.p = arrayOfString;
        localun.a.y = this;
        localun.a.v = arrayOfBoolean;
        localun.a.w = true;
      }
      return localun.a();
      if ((localCharSequence instanceof Spannable)) {
        efj.a(localTextView, (Spannable)localCharSequence);
      }
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    luu localluu = w();
    if (localluu != null) {
      localluu.c(this.m, this.D);
    }
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    luu localluu = w();
    if (localluu != null) {}
    switch (paramInt)
    {
    default: 
      Bundle localBundle = this.m;
      if ((localBundle.containsKey("list")) && (paramInt >= 0)) {
        localluu.a(paramInt, localBundle, this.D);
      }
      return;
    case -1: 
      localluu.a(this.m, this.D);
      return;
    }
    localluu.b(this.m, this.D);
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean)
  {
    luu localluu = w();
    if (localluu != null)
    {
      Bundle localBundle = this.m;
      if ((localBundle.containsKey("multi_choice_list")) && (paramInt >= 0)) {
        localluu.a(paramInt, paramBoolean, localBundle, this.D);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lut
 * JD-Core Version:    0.7.0.1
 */