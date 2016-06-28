import android.view.View;
import android.view.View.OnClickListener;

final class hip
  implements View.OnClickListener
{
  private final hgz a;
  private final String b;
  private final Integer c;
  
  hip(hin paramhin, String paramString, Integer paramInteger, hgz paramhgz)
  {
    this.b = paramString;
    this.c = paramInteger;
    this.a = paramhgz;
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.a(this.b, efj.h(this.c.intValue()));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hip
 * JD-Core Version:    0.7.0.1
 */