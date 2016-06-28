import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.oneprofile.about.OneProfileAboutContactInfoRowView;

public final class jfh
  implements View.OnClickListener
{
  public jfh(OneProfileAboutContactInfoRowView paramOneProfileAboutContactInfoRowView) {}
  
  public final void onClick(View paramView)
  {
    String str;
    if (this.a.b != null) {
      str = ((TextView)paramView).getText().toString();
    }
    switch (this.a.a)
    {
    default: 
      return;
    case 1000: 
      this.a.b.c(str);
      return;
    case 1001: 
      this.a.b.b(str);
      return;
    }
    this.a.b.d(str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfh
 * JD-Core Version:    0.7.0.1
 */