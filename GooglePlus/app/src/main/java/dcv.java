import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

final class dcv
  extends BaseAdapter
{
  private final Context a;
  private final ArrayList<btc> b;
  
  public dcv(Context paramContext, ArrayList<btc> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public final int getCount()
  {
    return this.b.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    btc localbtc = (btc)getItem(paramInt);
    if (paramView == null) {
      paramView = LayoutInflater.from(this.a).inflate(efj.uC, null);
    }
    paramView.setId(localbtc.c());
    MediaView localMediaView = (MediaView)paramView.findViewById(aaw.eR);
    if (localbtc.b() != null) {
      localMediaView.a(ipf.a(this.a, localbtc.b(), ipm.a));
    }
    for (;;)
    {
      ((TextView)paramView.findViewById(aaw.eS)).setText(localbtc.a(this.a));
      return paramView;
      int i = localbtc.a();
      Bitmap localBitmap = BitmapFactory.decodeResource(localMediaView.getContext().getResources(), i);
      if (localBitmap == null) {
        localBitmap = (Bitmap)MediaView.j.b();
      }
      localMediaView.C = localBitmap;
      localMediaView.b(true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcv
 * JD-Core Version:    0.7.0.1
 */