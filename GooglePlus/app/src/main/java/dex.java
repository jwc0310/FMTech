import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class dex
  extends hqi
{
  public View f;
  
  public dex(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (a(paramCursor.getPosition())) {
      return this.f;
    }
    return ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(efj.su, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    if (paramView == this.f) {}
    while (paramCursor.getPosition() >= super.getCount()) {
      return;
    }
    AvatarView localAvatarView = (AvatarView)paramView.findViewById(aaw.as);
    localAvatarView.setVisibility(0);
    localAvatarView.e = 0;
    localAvatarView.a(paramCursor.getString(2), paramCursor.getString(4));
    ((TextView)paramView.findViewById(aaw.fv)).setText(paramCursor.getString(3));
  }
  
  public final boolean a(int paramInt)
  {
    if (this.f != null) {}
    for (int i = 1; (i != 0) && (paramInt == super.getCount()); i = 0) {
      return true;
    }
    return false;
  }
  
  public final int getCount()
  {
    int i = 1;
    int j = super.getCount();
    int k;
    if (this.f != null)
    {
      k = i;
      if (k == 0) {
        break label29;
      }
    }
    for (;;)
    {
      return i + j;
      k = 0;
      break;
      label29:
      i = 0;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (a(paramInt)) {
      return 1;
    }
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt >= getCount())
    {
      if (paramView == null) {
        paramView = a(this.d, this.c, paramViewGroup);
      }
      return paramView;
    }
    if (a(paramInt)) {
      return this.f;
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dex
 * JD-Core Version:    0.7.0.1
 */