import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.ArrayList;

public final class jxb
{
  static ObjectAnimator c(View paramView, float paramFloat1, float paramFloat2)
  {
    return ObjectAnimator.ofFloat(paramView, "alpha", new float[] { paramFloat1, paramFloat2 });
  }
  
  public final ObjectAnimator a(View paramView, float paramFloat1, float paramFloat2)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, "scaleX", new float[] { 1.0F, paramFloat2 });
    localObjectAnimator.setRepeatMode(2);
    localObjectAnimator.setRepeatCount(1);
    localObjectAnimator.addUpdateListener(new jxc(this, paramView));
    return localObjectAnimator;
  }
  
  final <T extends View> ArrayList<Animator> a(ArrayList<T> paramArrayList, float paramFloat1, float paramFloat2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      localArrayList.add(c((View)paramArrayList.get(j), paramFloat1, paramFloat2));
    }
    return localArrayList;
  }
  
  final ArrayList<Animator> a(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)paramArrayList.get(j);
      ArgbEvaluator localArgbEvaluator = new ArgbEvaluator();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      ValueAnimator localValueAnimator = ValueAnimator.ofObject(localArgbEvaluator, arrayOfObject);
      localValueAnimator.addUpdateListener(new jxe(this, (GradientDrawable)localView.getBackground()));
      localArrayList.add(localValueAnimator);
    }
    return localArrayList;
  }
  
  public final ObjectAnimator b(View paramView, float paramFloat1, float paramFloat2)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, "scaleY", new float[] { 1.0F, 1.1F });
    localObjectAnimator.setRepeatMode(2);
    localObjectAnimator.setRepeatCount(1);
    localObjectAnimator.addUpdateListener(new jxd(this, paramView));
    return localObjectAnimator;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxb
 * JD-Core Version:    0.7.0.1
 */