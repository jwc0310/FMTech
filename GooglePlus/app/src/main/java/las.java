import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.squares.impl.edit.EditCategoryListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class las
  extends ArrayAdapter<kzc>
{
  private lat a;
  private Context b;
  private ArrayList<kzc> c;
  private int d;
  private gil e;
  
  public las(lat paramlat, Context paramContext, ArrayList<kzc> paramArrayList, int paramInt)
  {
    super(paramContext, aw.dX, paramArrayList);
    this.a = paramlat;
    this.b = paramContext;
    this.c = paramArrayList;
    this.d = 20;
    this.e = ((gil)mbb.a(paramContext, gil.class));
  }
  
  public final boolean a()
  {
    return this.c.size() <= 2;
  }
  
  public final void addAll(Collection<? extends kzc> paramCollection)
  {
    super.addAll(paramCollection);
    this.c.addAll(paramCollection);
  }
  
  public final void clear()
  {
    super.clear();
    this.c.clear();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = LayoutInflater.from(this.b).inflate(aw.dX, paramViewGroup, false);; localView = paramView)
    {
      EditCategoryListItem localEditCategoryListItem = (EditCategoryListItem)localView;
      localEditCategoryListItem.setOnClickListener(localEditCategoryListItem);
      this.e.a(localEditCategoryListItem);
      localEditCategoryListItem.b = paramInt;
      String str1 = ((kzc)this.c.get(paramInt)).b;
      localEditCategoryListItem.c.setText(str1);
      int i;
      label215:
      int j;
      label223:
      int k;
      label238:
      ImageView localImageView2;
      int m;
      if (TextUtils.isEmpty(localEditCategoryListItem.c.getText().toString()))
      {
        localEditCategoryListItem.c.setVisibility(8);
        localEditCategoryListItem.d.setVisibility(0);
        efj.a(localEditCategoryListItem, new gxq(pjo.ah));
        localEditCategoryListItem.setOnClickListener(new gxn(localEditCategoryListItem));
        localEditCategoryListItem.a = this.a;
        if ((paramInt == -1 + this.c.size()) || (a()))
        {
          if ((this.c.size() < this.d) || (TextUtils.isEmpty(((kzc)this.c.get(-1 + this.d)).a))) {
            break label334;
          }
          i = 1;
          if (i == 0) {
            break label340;
          }
        }
        j = 1;
        ImageView localImageView1 = localEditCategoryListItem.e;
        if (j == 0) {
          break label346;
        }
        k = 0;
        localImageView1.setVisibility(k);
        localImageView2 = localEditCategoryListItem.f;
        m = 0;
        if (j == 0) {
          break label353;
        }
      }
      for (;;)
      {
        localImageView2.setVisibility(m);
        gil localgil = this.e;
        String str2 = localEditCategoryListItem.r();
        localgil.a.put(str2, localEditCategoryListItem);
        return localView;
        localEditCategoryListItem.c.setVisibility(0);
        localEditCategoryListItem.d.setVisibility(8);
        efj.a(localEditCategoryListItem, new gxq(pjo.af));
        break;
        label334:
        i = 0;
        break label215;
        label340:
        j = 0;
        break label223;
        label346:
        k = 8;
        break label238;
        label353:
        m = 4;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     las
 * JD-Core Version:    0.7.0.1
 */