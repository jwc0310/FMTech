import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ads
  extends TextView
{
  private adr a = new adr(this);
  
  public ads(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ads(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public ads(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.a != null) {
      this.a.a(paramContext, paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ads
 * JD-Core Version:    0.7.0.1
 */