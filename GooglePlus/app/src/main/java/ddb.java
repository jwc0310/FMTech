import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ddb
  extends hqj
{
  private final ArrayList<Intent> r;
  private final ArrayList<Uri> s;
  private final ArrayList<Uri> t;
  private final int u;
  private boolean v;
  
  public ddb(Context paramContext, int paramInt, ArrayList<Intent> paramArrayList, ArrayList<Uri> paramArrayList1, ArrayList<Uri> paramArrayList2, boolean paramBoolean)
  {
    super(paramContext);
    this.r = paramArrayList;
    this.u = paramInt;
    this.v = paramBoolean;
    this.s = paramArrayList1;
    this.t = paramArrayList2;
  }
  
  public final Cursor o()
  {
    Context localContext = this.l;
    PackageManager localPackageManager = localContext.getPackageManager();
    hqr localhqr = new hqr(ddc.a);
    Object[] arrayOfObject = new Object[ddc.a.length];
    ArrayList localArrayList1 = new ArrayList();
    HashSet localHashSet = new HashSet();
    int i = this.r.size();
    for (int j = 0; j < i; j++)
    {
      List localList = localPackageManager.queryIntentActivities((Intent)this.r.get(j), 65536);
      ArrayList localArrayList2 = new ArrayList();
      Resources localResources = localContext.getResources();
      String str1 = localResources.getString(aau.cf);
      String str2 = localResources.getString(aau.oL);
      if ((this.u == -1) && (j == 0)) {}
      for (int i3 = -1 + localList.size();; i3--) {
        if (i3 >= 0)
        {
          if (TextUtils.equals(str1, ((ResolveInfo)localList.get(i3)).loadLabel(localPackageManager))) {
            localArrayList2.add(0, (ResolveInfo)localList.remove(i3));
          }
        }
        else
        {
          if (!this.v) {
            break;
          }
          int i1 = localList.size();
          for (int i2 = 0; i2 < i1; i2++)
          {
            ResolveInfo localResolveInfo2 = (ResolveInfo)localList.get(i2);
            if ((!localHashSet.contains(localResolveInfo2.activityInfo.packageName)) && (!TextUtils.equals(str2, ((ResolveInfo)localList.get(i2)).loadLabel(localPackageManager)))) {
              localArrayList2.add(localResolveInfo2);
            }
          }
        }
      }
      int k = localArrayList1.size();
      int m = localArrayList2.size();
      Intent localIntent = (Intent)this.r.get(j);
      int n = 0;
      if (n < m)
      {
        ResolveInfo localResolveInfo1 = (ResolveInfo)localArrayList2.get(n);
        CharSequence localCharSequence = localResolveInfo1.loadLabel(localPackageManager);
        Parcel localParcel = Parcel.obtain();
        ArrayList localArrayList3;
        if (TextUtils.equals(localCharSequence, str1))
        {
          localArrayList3 = this.t;
          label382:
          if (localArrayList3.size() <= 1) {
            break label491;
          }
          localIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList3);
        }
        for (;;)
        {
          localIntent.writeToParcel(localParcel, 0);
          localResolveInfo1.writeToParcel(localParcel, 0);
          byte[] arrayOfByte = localParcel.marshall();
          Arrays.fill(arrayOfObject, null);
          arrayOfObject[0] = Integer.valueOf(k + n);
          arrayOfObject[1] = localCharSequence;
          arrayOfObject[2] = arrayOfByte;
          localhqr.a(arrayOfObject);
          localHashSet.add(localResolveInfo1.activityInfo.packageName);
          n++;
          break;
          localArrayList3 = this.s;
          break label382;
          label491:
          if (localArrayList3.size() == 1) {
            localIntent.putExtra("android.intent.extra.STREAM", (Parcelable)localArrayList3.get(0));
          }
        }
      }
      localArrayList1.addAll(localArrayList2);
    }
    return localhqr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddb
 * JD-Core Version:    0.7.0.1
 */