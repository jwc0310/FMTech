import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.ArrayList;

final class cju
  extends BaseAdapter
{
  final Context a;
  final git b;
  private final ArrayList<cjw> c = new ArrayList();
  
  public cju(Context paramContext, gnb paramgnb, git paramgit)
  {
    for (jjd localjjd : paramgnb.b) {
      this.c.add(new cjw(localjjd));
    }
    int k = Math.max(0, paramgnb.a - paramgnb.b.length);
    if (k > 0)
    {
      Resources localResources = paramContext.getResources();
      int m = efj.xe;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(k);
      String str = localResources.getQuantityString(m, k, arrayOfObject);
      this.c.add(new cjw(1, str));
    }
    this.a = paramContext;
    this.b = paramgit;
  }
  
  public final int getCount()
  {
    return this.c.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((cjw)this.c.get(paramInt)).a;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(efj.su, paramViewGroup, false);
    }
    cjw localcjw = (cjw)this.c.get(paramInt);
    paramView.setTag(localcjw);
    AvatarView localAvatarView = (AvatarView)paramView.findViewById(aaw.as);
    switch (localcjw.a)
    {
    }
    for (;;)
    {
      ((TextView)paramView.findViewById(aaw.fv)).setText(localcjw.c);
      return paramView;
      if ((localcjw.b != null) && (!TextUtils.isEmpty(localcjw.b.a)))
      {
        String str = localcjw.b.d;
        localAvatarView.a(localcjw.b.a, hdo.b(str));
      }
      localAvatarView.setVisibility(0);
      paramView.setOnClickListener(new cjv(this, localcjw));
      continue;
      localAvatarView.setVisibility(4);
      paramView.setOnClickListener(null);
    }
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cju
 * JD-Core Version:    0.7.0.1
 */