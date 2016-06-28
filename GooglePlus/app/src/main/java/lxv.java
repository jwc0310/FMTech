import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class lxv
  extends ClickableSpan
{
  private Intent a;
  private Context b;
  
  public lxv(Context paramContext, Intent paramIntent)
  {
    this.a = paramIntent;
    this.b = paramContext;
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {}
    try
    {
      this.b.startActivity(this.a);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      String str = String.valueOf(this.a);
      new StringBuilder(30 + String.valueOf(str).length()).append("Failed to start Activity with ").append(str);
    }
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxv
 * JD-Core Version:    0.7.0.1
 */