import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class iov
  extends FrameLayout
{
  public int a;
  public giz b;
  public View c;
  public View d;
  public TextView e;
  public TextView f;
  public AvatarView g;
  
  public iov(Context paramContext)
  {
    super(paramContext);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(efj.OQ, this, true);
    this.c = findViewById(aau.Ag);
    this.d = findViewById(aau.Aj);
    this.e = ((TextView)findViewById(aau.Ai));
    this.f = ((TextView)findViewById(aau.Ah));
    this.g = ((AvatarView)findViewById(aau.Af));
    this.b = ((giz)mbb.a(getContext(), giz.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iov
 * JD-Core Version:    0.7.0.1
 */