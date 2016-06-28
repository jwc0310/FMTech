import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(11)
public final class dbs
{
  private static final ClipDescription a = null;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ClipDescription(null, new String[] { "text/uri-list" });
      return;
    }
  }
  
  public static Intent a(String paramString, int paramInt, ipf paramipf, Context paramContext)
  {
    Intent localIntent = new Intent();
    if (("android.intent.action.PICK".equalsIgnoreCase(paramString)) || ("android.intent.action.GET_CONTENT".equalsIgnoreCase(paramString))) {
      localIntent.setData(a(paramipf, paramString, paramContext));
    }
    for (;;)
    {
      localIntent.addFlags(1);
      return localIntent;
      if (!"android.intent.action.SEND".equalsIgnoreCase(paramString)) {
        break;
      }
      localIntent.putExtra("android.intent.extra.STREAM", a(paramipf, paramString, paramContext));
      localIntent.setType(a(paramInt));
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Unsupported action: ".concat(str1);; str2 = new String("Unsupported action: ")) {
      throw new IllegalArgumentException(str2);
    }
  }
  
  @TargetApi(16)
  public static Intent a(String paramString, int paramInt, isq paramisq, Context paramContext)
  {
    Intent localIntent = new Intent();
    ArrayList localArrayList1 = paramisq.a(jpx.class);
    if (paramisq.b <= 0) {
      throw new IllegalArgumentException("Argument mediaSelection may not be empty!");
    }
    if (("android.intent.action.PICK".equalsIgnoreCase(paramString)) || ("android.intent.action.GET_CONTENT".equalsIgnoreCase(paramString))) {
      a(localIntent, paramString, localArrayList1, paramContext);
    }
    for (;;)
    {
      localIntent.addFlags(1);
      return localIntent;
      if (!"android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(paramString)) {
        break;
      }
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      while (localIterator.hasNext()) {
        localArrayList2.add(a(((jpx)localIterator.next()).e(), paramString, paramContext));
      }
      localIntent.setAction("android.intent.action.SEND_MULTIPLE");
      localIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList2);
      localIntent.setType(a(paramInt));
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Unsupported action: ".concat(str1);; str2 = new String("Unsupported action: ")) {
      throw new IllegalArgumentException(str2);
    }
  }
  
  private static Uri a(ipf paramipf, String paramString, Context paramContext)
  {
    if (paramipf.d != null)
    {
      if (paramipf.d.getScheme().equals("file"))
      {
        Uri localUri2 = GooglePhotosImageProvider.a(paramContext, paramipf.d.toString(), paramipf.e);
        GooglePhotosImageProvider.a(paramContext, localUri2, paramString, a(paramipf.e.e));
        return localUri2;
      }
      return paramipf.d;
    }
    Uri localUri1 = GooglePhotosImageProvider.a(paramContext, paramipf.c, paramipf.e);
    GooglePhotosImageProvider.a(paramContext, localUri1, paramString, a(paramipf.e.e));
    return localUri1;
  }
  
  private static String a(int paramInt)
  {
    if ((paramInt == 0) || ((paramInt & 0x3) != 0)) {
      return "*/*";
    }
    if ((paramInt & 0x1) != 0) {
      return "image/*";
    }
    if ((paramInt & 0x2) != 0) {
      return "video/*";
    }
    return "*/*";
  }
  
  @TargetApi(16)
  public static void a(Intent paramIntent, String paramString, List<jpx> paramList, Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 16) {
      return;
    }
    Iterator localIterator = paramList.iterator();
    ClipData localClipData = null;
    while (localIterator.hasNext())
    {
      ClipData.Item localItem = new ClipData.Item(a(((jpx)localIterator.next()).e(), paramString, paramContext));
      if (localClipData == null) {
        localClipData = new ClipData(a, localItem);
      } else {
        localClipData.addItem(localItem);
      }
    }
    paramIntent.setClipData(localClipData);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbs
 * JD-Core Version:    0.7.0.1
 */