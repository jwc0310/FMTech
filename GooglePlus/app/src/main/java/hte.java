import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class hte
  extends mca
{
  TextView a;
  private git b;
  private String c;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Ki, paramViewGroup, false);
    Bundle localBundle = this.m;
    if ((localBundle == null) || (localBundle.getString("bundled_text_key") == null)) {
      throw new IllegalStateException("This fragment must be called with a String argument.");
    }
    this.c = localBundle.getString("bundled_text_key");
    this.a = ((TextView)localView.findViewById(aau.zP));
    this.a.setMovementMethod(new ScrollingMovementMethod());
    CheckedTextView localCheckedTextView = (CheckedTextView)localView.findViewById(aau.zN);
    localCheckedTextView.setOnClickListener(new htf(this, localCheckedTextView));
    this.a.setText(a(localCheckedTextView.isChecked()));
    return localView;
  }
  
  final String a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      String str1 = this.c;
      Matcher localMatcher = Pattern.compile("(//([a-z0-9-]+)\\.[a-z0-9-]+\\.com).*?(,)").matcher(str1);
      StringBuffer localStringBuffer = new StringBuffer();
      while (localMatcher.find())
      {
        String str2 = String.valueOf(Integer.toHexString(localMatcher.group(0).hashCode()));
        localMatcher.appendReplacement(localStringBuffer, Matcher.quoteReplacement(15 + String.valueOf(str2).length() + "//example.com/" + str2 + ","));
      }
      localMatcher.appendTail(localStringBuffer);
      return localStringBuffer.toString();
    }
    return this.c;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.a(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(efj.Km, paramMenu);
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aau.zO)
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      String str1 = String.valueOf(this.b.f().b("account_name"));
      if (str1.length() != 0) {}
      for (String str2 = "Application info dump:".concat(str1);; str2 = new String("Application info dump:"))
      {
        localIntent.putExtra("android.intent.extra.SUBJECT", str2);
        localIntent.putExtra("android.intent.extra.TEXT", this.a.getText());
        localIntent.setType("text/plain");
        a(localIntent);
        return true;
      }
    }
    return false;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((git)this.bo.a(git.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hte
 * JD-Core Version:    0.7.0.1
 */