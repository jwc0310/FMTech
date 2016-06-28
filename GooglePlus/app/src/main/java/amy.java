import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.apps.photoeditor.views.ItemSelectorView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.List;

public final class amy
  extends RelativeLayout
{
  public final int a = getResources().getDimensionPixelSize(efj.cg);
  public final LinearLayout b;
  public final View c;
  public anc d;
  public List<ToolButton> e;
  public final ToolButton f;
  public final View.OnClickListener g = new amz(this);
  private final HorizontalScrollView i;
  
  public amy(ItemSelectorView paramItemSelectorView, Context paramContext)
  {
    super(paramContext);
    this.i = new HorizontalScrollView(paramContext);
    this.i.setId(1);
    this.c = new View(paramContext);
    this.c.setBackgroundColor(-14277082);
    this.c.setId(2);
    this.f = ItemSelectorView.a(paramItemSelectorView, paramContext);
    this.f.setId(3);
    this.f.setPadding(this.a, this.a, this.a, this.a);
    this.f.setMinimumWidth(paramContext.getResources().getDimensionPixelSize(efj.cd));
    this.f.setOnClickListener(new ana(this, paramItemSelectorView));
    this.b = new LinearLayout(paramContext);
    this.b.setPadding(this.a / 2, 0, this.a / 2, 0);
    if (ghv.b(paramContext))
    {
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams1.addRule(10, -1);
      localLayoutParams1.addRule(11, -1);
      localLayoutParams1.addRule(1, 2);
      addView(this.i, localLayoutParams1);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(2, -1);
      localLayoutParams2.addRule(6, 1);
      localLayoutParams2.addRule(8, 1);
      localLayoutParams2.addRule(1, 3);
      addView(this.c, localLayoutParams2);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
      localLayoutParams3.addRule(9, -1);
      localLayoutParams3.addRule(8, 1);
      addView(this.f, localLayoutParams3);
      this.i.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
      return;
    }
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams4.addRule(10, -1);
    localLayoutParams4.addRule(9, -1);
    localLayoutParams4.addRule(0, 2);
    addView(this.i, localLayoutParams4);
    RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(2, -1);
    localLayoutParams5.addRule(6, 1);
    localLayoutParams5.addRule(8, 1);
    localLayoutParams5.addRule(0, 3);
    addView(this.c, localLayoutParams5);
    RelativeLayout.LayoutParams localLayoutParams6 = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams6.addRule(11, -1);
    localLayoutParams6.addRule(8, 1);
    addView(this.f, localLayoutParams6);
    this.i.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
  }
  
  public static void a(ToolButton paramToolButton, Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0)) {}
    do
    {
      for (;;)
      {
        return;
        if (!(paramArrayOfObject instanceof Bitmap[])) {
          break;
        }
        Bitmap localBitmap1 = (Bitmap)paramArrayOfObject[0];
        if (paramArrayOfObject.length > 1) {}
        for (Bitmap localBitmap2 = (Bitmap)paramArrayOfObject[1]; localBitmap1 != null; localBitmap2 = localBitmap1)
        {
          Resources localResources = paramToolButton.getResources();
          StateListDrawable localStateListDrawable = new StateListDrawable();
          if (localBitmap2 != null)
          {
            BitmapDrawable localBitmapDrawable1 = new BitmapDrawable(localResources, localBitmap2);
            localStateListDrawable.addState(new int[] { 16842910, 16842913 }, localBitmapDrawable1);
          }
          BitmapDrawable localBitmapDrawable2 = new BitmapDrawable(localResources, localBitmap1);
          BitmapDrawable localBitmapDrawable3 = paramToolButton.a(localBitmapDrawable2);
          localStateListDrawable.addState(new int[] { -16842910 }, localBitmapDrawable3);
          localStateListDrawable.addState(new int[] { -16842910, 16842913 }, localBitmapDrawable3);
          localStateListDrawable.addState(StateSet.WILD_CARD, localBitmapDrawable2);
          paramToolButton.a.setImageDrawable(localStateListDrawable);
          return;
        }
      }
    } while (!(paramArrayOfObject instanceof Integer[]));
    int j = ((Integer)paramArrayOfObject[0]).intValue();
    if (paramArrayOfObject.length > 1) {}
    for (int k = ((Integer)paramArrayOfObject[1]).intValue();; k = j)
    {
      paramToolButton.a(j, k, 0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amy
 * JD-Core Version:    0.7.0.1
 */