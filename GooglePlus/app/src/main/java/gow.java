import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.Collection;

public final class gow
  extends ImageView
  implements hru
{
  static boolean a = true;
  private final hrs b;
  private Animation c;
  private Animation d;
  private Parcelable e;
  private final Paint f = new Paint();
  private final PorterDuffColorFilter g;
  
  public gow(Context paramContext)
  {
    super(paramContext);
    this.f.setAntiAlias(true);
    this.f.setColor(-1);
    this.g = new PorterDuffColorFilter(getContext().getResources().getColor(efj.DP), PorterDuff.Mode.SRC_ATOP);
    this.b = ((hrs)mbb.b(getContext(), hrs.class));
    if ((this.b instanceof hrw)) {
      ((hrw)this.b).a(this);
    }
    setTag("item_check_view_tag");
    setImageResource(efj.Eh);
    setVisibility(8);
    this.c = AnimationUtils.loadAnimation(getContext(), efj.DO);
    this.d = AnimationUtils.loadAnimation(getContext(), efj.DN);
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    Animation localAnimation = getAnimation();
    if ((localAnimation != null) && (localAnimation.hasStarted())) {
      localAnimation.cancel();
    }
    if ((this.e != null) && (this.e.equals(paramParcelable))) {
      switch (gox.a[(paramInt - 1)])
      {
      default: 
        if (getVisibility() != 8)
        {
          if ((a) && (this.d != null)) {
            startAnimation(this.d);
          }
          setVisibility(8);
        }
        break;
      }
    }
    do
    {
      do
      {
        return;
      } while (getVisibility() == 0);
      setVisibility(0);
    } while ((!a) || (this.c == null));
    startAnimation(this.c);
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection) {}
  
  public final void a(Parcelable paramParcelable)
  {
    this.e = paramParcelable;
    if ((this.b != null) && (this.b.c(this.e)))
    {
      setVisibility(0);
      return;
    }
    setVisibility(8);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    int i = getWidth() / 2;
    paramCanvas.drawCircle(i, i, i, this.f);
    getDrawable().setColorFilter(this.g);
    getDrawable().draw(paramCanvas);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gow
 * JD-Core Version:    0.7.0.1
 */