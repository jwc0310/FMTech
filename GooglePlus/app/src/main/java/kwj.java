import android.annotation.TargetApi;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.libraries.social.socialcast.impl.SocialCastMediaView;

public final class kwj
  extends GestureDetector.SimpleOnGestureListener
{
  kwj(SocialCastMediaView paramSocialCastMediaView) {}
  
  private final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a.a.e()))
    {
      gwz.a(this.a, 21);
      this.a.a.o();
    }
    if ((!paramBoolean) && (this.a.a.d()))
    {
      gwz.a(this.a, 21);
      this.a.a.p();
    }
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  @TargetApi(17)
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Configuration localConfiguration = this.a.getResources().getConfiguration();
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 17) && (localConfiguration.getLayoutDirection() == 1))
    {
      bool = true;
      if (paramMotionEvent1.getX() - paramMotionEvent2.getX() <= 120.0F) {
        break label61;
      }
    }
    for (;;)
    {
      a(bool);
      label61:
      do
      {
        return true;
        bool = false;
        break;
      } while (paramMotionEvent2.getX() - paramMotionEvent1.getX() <= 120.0F);
      if (!bool) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    this.a.c = true;
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwj
 * JD-Core Version:    0.7.0.1
 */