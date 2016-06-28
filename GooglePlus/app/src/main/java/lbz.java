import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.squares.impl.edit.EditRelatedLinkListItem;
import java.util.ArrayList;
import java.util.HashMap;

final class lbz
  extends ArrayAdapter
{
  private lat a;
  private gil b;
  private Context c;
  
  public lbz(lat paramlat, Context paramContext, ArrayList<odq> paramArrayList)
  {
    super(paramContext, aw.dY, paramArrayList);
    this.c = paramContext;
    this.a = paramlat;
    this.b = ((gil)mbb.a(paramContext, gil.class));
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = LayoutInflater.from(this.c).inflate(aw.dY, paramViewGroup, false);; localView = paramView)
    {
      EditRelatedLinkListItem localEditRelatedLinkListItem = (EditRelatedLinkListItem)localView;
      this.b.a(localEditRelatedLinkListItem);
      odq localodq = (odq)getItem(paramInt);
      localView.setOnClickListener(localEditRelatedLinkListItem);
      String str1 = localodq.b;
      localEditRelatedLinkListItem.d.setText(str1);
      String str2 = localodq.a;
      localEditRelatedLinkListItem.c.setText(str2);
      if (TextUtils.isEmpty(localEditRelatedLinkListItem.c.getText().toString()))
      {
        localEditRelatedLinkListItem.f.setVisibility(4);
        localEditRelatedLinkListItem.g.setVisibility(4);
        localEditRelatedLinkListItem.d.setVisibility(8);
        localEditRelatedLinkListItem.c.setVisibility(8);
        localEditRelatedLinkListItem.e.setVisibility(0);
      }
      for (gxt localgxt = pjo.an;; localgxt = pjo.al)
      {
        efj.a(localEditRelatedLinkListItem, new gxq(localgxt));
        localEditRelatedLinkListItem.setOnClickListener(new gxn(localEditRelatedLinkListItem));
        localEditRelatedLinkListItem.b = paramInt;
        localEditRelatedLinkListItem.a = this.a;
        gil localgil = this.b;
        String str3 = localEditRelatedLinkListItem.r();
        localgil.a.put(str3, localEditRelatedLinkListItem);
        return localView;
        localEditRelatedLinkListItem.f.setVisibility(0);
        localEditRelatedLinkListItem.g.setVisibility(0);
        localEditRelatedLinkListItem.d.setVisibility(0);
        localEditRelatedLinkListItem.c.setVisibility(0);
        localEditRelatedLinkListItem.e.setVisibility(8);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbz
 * JD-Core Version:    0.7.0.1
 */