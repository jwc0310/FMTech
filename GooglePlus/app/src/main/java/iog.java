import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class iog
  extends ioh
{
  public int a;
  public String b;
  public boolean c;
  public boolean d;
  
  iog(iod paramiod)
  {
    super(paramiod);
  }
  
  public final int a()
  {
    return 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
  {
    return paramLayoutInflater.inflate(efj.OK, paramViewGroup, false);
  }
  
  public final void a(View paramView, int paramInt)
  {
    int i = 4;
    View localView1 = paramView.findViewById(aw.aL);
    View localView2 = paramView.findViewById(aw.aI);
    localView2.setTag(Integer.valueOf(paramInt));
    localView2.setOnClickListener(this.h);
    View localView4;
    int j;
    switch (this.a)
    {
    default: 
      View localView3 = paramView.findViewById(aw.aN);
      if (this.c) {
        i = 0;
      }
      localView3.setVisibility(i);
      localView4 = paramView.findViewById(aw.aJ);
      boolean bool = this.d;
      j = 0;
      if (!bool) {
        break;
      }
    }
    for (;;)
    {
      localView4.setVisibility(j);
      ((TextView)paramView.findViewById(aw.aK)).setText(this.f);
      ((AvatarView)paramView.findViewById(aw.aH)).a(null, this.g);
      localView4.setTag(Integer.valueOf(paramInt));
      localView4.setOnClickListener(this.h);
      return;
      localView2.setBackgroundDrawable(iod.a);
      localView1.setVisibility(i);
      break;
      localView2.setBackgroundDrawable(iod.b);
      localView1.setVisibility(0);
      break;
      localView2.setBackgroundDrawable(iod.c);
      localView1.setVisibility(0);
      break;
      localView2.setBackgroundDrawable(iod.d);
      localView1.setVisibility(i);
      break;
      j = 8;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iog
 * JD-Core Version:    0.7.0.1
 */