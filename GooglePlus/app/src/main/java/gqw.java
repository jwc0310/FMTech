import android.annotation.SuppressLint;
import android.util.Log;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class gqw
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, View.OnClickListener, View.OnLongClickListener, View.OnTouchListener
{
  public gqm a;
  public gqm b;
  public gqm c;
  private View d;
  private lo e;
  private gqn f;
  private gvj g;
  private View h;
  
  public gqw(View paramView)
  {
    this(paramView, null);
  }
  
  public gqw(View paramView1, View paramView2)
  {
    efj.e(paramView1, "ActionHandler must be passed a non-null View");
    this.d = paramView1;
    this.f = ((gqn)mbb.a(paramView1.getContext(), gqn.class));
    if (paramView2 != null)
    {
      this.h = paramView2;
      this.g = ((gvj)mbb.a(paramView1.getContext(), gvj.class));
    }
  }
  
  private final void a()
  {
    this.d.setOnClickListener(null);
    this.d.setClickable(false);
    this.d.setOnLongClickListener(null);
    this.d.setLongClickable(false);
    this.a = null;
    this.b = null;
    this.c = null;
  }
  
  private void a(List<gqm> paramList)
  {
    a();
    if (paramList.isEmpty()) {}
    do
    {
      return;
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        gqm localgqm = (gqm)paramList.get(j);
        if (localgqm != null) {
          switch (localgqm.a())
          {
          default: 
            int k = localgqm.a();
            Log.e("ViewActionHandler", 36 + "Invalid activation type: " + k);
          }
        }
        for (;;)
        {
          j++;
          break;
          this.a = localgqm;
          continue;
          this.b = localgqm;
          continue;
          this.c = localgqm;
        }
      }
      if (this.c != null)
      {
        if (this.e == null)
        {
          this.e = new lo(this.d.getContext(), this);
          this.e.a.a(this);
        }
        this.d.setOnTouchListener(this);
        this.d.setClickable(true);
      }
      if (this.a != null) {
        this.d.setOnClickListener(new gxn(this));
      }
    } while (this.b == null);
    this.d.setOnLongClickListener(new gxo(this));
  }
  
  private final void b(gqm paramgqm)
  {
    if (this.h != null) {
      this.g.a(this.h);
    }
    this.f.a(paramgqm);
  }
  
  public final void a(gqm paramgqm)
  {
    if (paramgqm == null)
    {
      a();
      return;
    }
    a(new ArrayList(Arrays.asList(new gqm[] { paramgqm })));
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.d) {
      b(this.a);
    }
  }
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (this.c != null)
    {
      b(this.c);
      return true;
    }
    return false;
  }
  
  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    this.d.setPressed(true);
    return true;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final boolean onLongClick(View paramView)
  {
    if (paramView == this.d)
    {
      b(this.b);
      return true;
    }
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if (this.b != null) {
      this.d.performLongClick();
    }
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (this.a != null)
    {
      this.d.performClick();
      return true;
    }
    return false;
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    this.d.setPressed(false);
    return false;
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramView == this.d) {
      return this.e.a.a(paramMotionEvent);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqw
 * JD-Core Version:    0.7.0.1
 */