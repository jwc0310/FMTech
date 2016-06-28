package com.google.android.libraries.social.mediapicker;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import bk;
import bp;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.ui.views.ObservableGridView;
import cv;
import cw;
import da;
import efj;
import ehr;
import fp;
import fu;
import git;
import gjb;
import gzi;
import gzj;
import haa;
import hae;
import ipa;
import ipm;
import irl;
import irn;
import irp;
import irq;
import iru;
import irv;
import irw;
import irx;
import iry;
import irz;
import isa;
import isb;
import isl;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jos;
import jov;
import jpd;
import jpe;
import luu;
import mbb;
import mbf;
import mca;

public final class MediaPickerFragment
  extends mca
  implements cw<Cursor>, gzi, irq, luu
{
  private static final String[] ab = { "_id", "media_type", "date_added" };
  public boolean Z;
  public int a = -1;
  public boolean aa;
  private Uri ac;
  private irl ad;
  private isb ae;
  private boolean af;
  private gzj ag;
  private boolean ah;
  private jov ai;
  private jpd aj;
  private final jpe ak;
  private final jpe al;
  private final jpe am;
  private final jpe an;
  private final View.OnClickListener ao;
  public irp b;
  public ObservableGridView c;
  public int d;
  
  public MediaPickerFragment()
  {
    if (Build.VERSION.SDK_INT < 23) {}
    for (Object localObject = new jos();; localObject = new iru(this))
    {
      this.aj = ((jpd)localObject);
      this.ak = new irv(this);
      this.al = new irw(this);
      this.am = new irx(this);
      this.an = new iry(this);
      this.ao = new isa(this);
      return;
    }
  }
  
  private static File a(ipm paramipm)
  {
    String str1 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    if (paramipm == ipm.a) {}
    for (String str2 = 8 + String.valueOf(str1).length() + "IMG_" + str1 + ".jpg";; str2 = 8 + String.valueOf(str1).length() + "VID_" + str1 + ".mp4")
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), "GooglePlus");
      if ((!localFile.exists()) && (!localFile.mkdir())) {
        break label146;
      }
      return new File(localFile, str2);
      if (paramipm != ipm.b) {
        break;
      }
    }
    return null;
    label146:
    return null;
  }
  
  private void a(Cursor paramCursor)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.af)
    {
      MatrixCursor localMatrixCursor1 = new MatrixCursor(ab);
      localMatrixCursor1.addRow(a(-101L));
      localArrayList.add(localMatrixCursor1);
    }
    if ((this.aa) || (!this.Z))
    {
      MatrixCursor localMatrixCursor2 = new MatrixCursor(ab);
      localMatrixCursor2.addRow(a(-102L));
      localArrayList.add(localMatrixCursor2);
    }
    if (paramCursor != null) {
      localArrayList.add(paramCursor);
    }
    if (localArrayList.size() > 0)
    {
      Cursor[] arrayOfCursor = new Cursor[localArrayList.size()];
      localArrayList.toArray(arrayOfCursor);
      MergeCursor localMergeCursor = new MergeCursor(arrayOfCursor);
      this.ae.b(localMergeCursor);
      if (this.a != -1) {
        this.c.setSelection(this.a);
      }
    }
  }
  
  private final void a(ArrayList<ipa> paramArrayList, ArrayList<Uri> paramArrayList1)
  {
    int i = paramArrayList1.size();
    for (int j = 0;; j++)
    {
      Uri localUri;
      if (j < i)
      {
        localUri = (Uri)paramArrayList1.get(j);
        if (localUri != null) {
          break label31;
        }
      }
      label31:
      ipm localipm;
      do
      {
        return;
        localipm = irn.a(this.bn, localUri, null);
      } while (localipm == null);
      paramArrayList.add(new irn(this.bn, localUri, localipm));
    }
  }
  
  private static Object[] a(long paramLong)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = null;
    arrayOfObject[2] = null;
    return arrayOfObject;
  }
  
  private final boolean b(int paramInt)
  {
    if (this.ac == null) {
      return false;
    }
    if (paramInt == -1) {
      return true;
    }
    String str = this.ac.toString();
    if (str.startsWith("file:/")) {
      str = str.substring("file:/".length());
    }
    new File(str).delete();
    this.ac = null;
    return false;
  }
  
  private final boolean b(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      Iterator localIterator = this.bn.getPackageManager().queryIntentActivities(paramIntent, 64).iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!((ResolveInfo)localIterator.next()).activityInfo.packageName.equals("android"));
      return true;
    }
    return false;
    return false;
  }
  
  private final List<String> x()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    return Arrays.asList(arrayOfString);
  }
  
  private final List<String> y()
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "android.permission.CAMERA";
    arrayOfString[1] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[2] = "android.permission.WRITE_EXTERNAL_STORAGE";
    return Arrays.asList(arrayOfString);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.PV, paramViewGroup, false);
    this.c = ((ObservableGridView)localView1.findViewById(efj.PH));
    this.c.setSelector(ehr.cK);
    Bundle localBundle = this.m;
    if (localBundle != null)
    {
      String str = localBundle.getString("header_text");
      if (!TextUtils.isEmpty(str))
      {
        ((TextView)localView1.findViewById(efj.PK)).setText(str);
        View localView2 = localView1.findViewById(efj.PI);
        localView2.setVisibility(0);
        localView2.setOnClickListener(this.ao);
        AvatarView localAvatarView = (AvatarView)localView1.findViewById(efj.PJ);
        localAvatarView.g = false;
        gjb localgjb = ((git)mbb.a(this.bn, git.class)).f();
        localAvatarView.a(localgjb.b("gaia_id"), localgjb.b("profile_photo_url"));
      }
      this.d = localBundle.getInt("media_picker_mode");
      this.ah = localBundle.getBoolean("copy_content_uri_in_picker", false);
    }
    this.c.setOnScrollListener(new irz(this));
    this.c.setAdapter(this.ae);
    v();
    return localView1;
  }
  
  @TargetApi(11)
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!a(1)) {}
    for (int i = 1; i == 0; i = 0)
    {
      String[] arrayOfString = { "_id", "date_added" };
      return new fp(f(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, arrayOfString, "_id", null, String.valueOf("date_added").concat(" DESC"));
    }
    Uri localUri = Uri.parse("content://media/external/file");
    return new fp(f(), localUri, ab, "media_type=1 OR media_type=3", null, "date_added DESC");
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (1 == paramInt1) {
      if (b(paramInt2)) {
        this.ai.a(this.aj, efj.PN, x());
      }
    }
    do
    {
      do
      {
        return;
        if (2 != paramInt1) {
          break;
        }
      } while (!b(paramInt2));
      this.ai.a(this.aj, efj.PO, x());
      return;
    } while ((3 != paramInt1) || (paramInt2 != -1));
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if (Build.VERSION.SDK_INT >= 16)
    {
      ClipData localClipData = paramIntent.getClipData();
      if ((localClipData != null) && (localClipData.getItemCount() > 0)) {
        for (int i = 0; i < localClipData.getItemCount(); i++) {
          localArrayList1.add(localClipData.getItemAt(i).getUri());
        }
      }
    }
    Uri localUri = paramIntent.getData();
    if (!localArrayList1.contains(localUri)) {
      localArrayList1.add(localUri);
    }
    if (this.ah)
    {
      this.ag.c(new isl(localArrayList1, this.bn));
      return;
    }
    a(localArrayList2, localArrayList1);
    this.b.a(localArrayList2, this);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    if (paramInt == 0)
    {
      w();
      return;
    }
    this.ai.a(this.aj, efj.PQ, y());
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    boolean bool = true;
    super.a(paramBundle);
    this.aa = bool;
    if ((this.bn.getPackageManager().hasSystemFeature("android.hardware.camera")) || (this.bn.getPackageManager().hasSystemFeature("android.hardware.camera.front"))) {}
    for (;;)
    {
      this.af = bool;
      this.Z = this.ad.a();
      this.ae = new isb(this, f().getApplicationContext());
      if (paramBundle != null)
      {
        this.ac = ((Uri)paramBundle.getParcelable("STATE_CURRENT_PHOTO_PATH"));
        this.a = paramBundle.getInt("STATE_SCROLL_POSITION", -1);
        this.aa = paramBundle.getBoolean("STATE_ALL_PHOTOS_OPTION");
      }
      this.ai.a(efj.PP, this.ak).a(efj.PQ, this.al).a(efj.PN, this.am).a(efj.PO, this.an);
      return;
      bool = false;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString) {}
  
  public final void a(fu<Cursor> paramfu)
  {
    this.ae.b(null);
  }
  
  public final void a(String paramString, Uri paramUri, ipm paramipm)
  {
    String str = this.ac.getPath();
    ContentResolver localContentResolver = this.bn.getContentResolver();
    Cursor localCursor = localContentResolver.query(paramUri, new String[] { paramString }, String.valueOf(paramString).concat(" = ?"), new String[] { str }, null);
    if ((localCursor != null) && (localCursor.moveToFirst())) {}
    ContentValues localContentValues;
    for (Uri localUri = Uri.fromFile(new File(localCursor.getString(localCursor.getColumnIndexOrThrow(paramString))));; localUri = localContentResolver.insert(paramUri, localContentValues))
    {
      if (localCursor != null) {
        localCursor.close();
      }
      irn localirn = new irn(f(), localUri, paramipm);
      this.b.a(localirn, this);
      this.ac = null;
      return;
      localContentValues = new ContentValues(1);
      localContentValues.put(paramString, str);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (!"SetCopyContentUriTask".equals(paramString)) {
      return;
    }
    if (paramhae == null) {
      throw new NullPointerException();
    }
    ArrayList localArrayList1 = paramhae.a().getStringArrayList("final_uris");
    if (localArrayList1 == null)
    {
      Toast.makeText(this.bn, da.l, 1).show();
      return;
    }
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    for (int i = 0; i < localArrayList1.size(); i++)
    {
      Uri localUri = Uri.parse((String)localArrayList1.get(i));
      if (localUri == null) {
        throw new NullPointerException();
      }
      ipm localipm = irn.a(this.bn, localUri, null);
      if (localipm == null) {
        throw new NullPointerException();
      }
      localArrayList2.add(new irn(this.bn, localUri, localipm));
    }
    this.b.a(localArrayList2, this);
  }
  
  public final void a(ArrayList<ipa> paramArrayList, Object paramObject)
  {
    if ((this != paramObject) && (this.c.getAdapter() != null)) {
      ((isb)this.c.getAdapter()).notifyDataSetChanged();
    }
  }
  
  public final boolean a(int paramInt)
  {
    if (this.m == null) {}
    while ((paramInt & this.m.getInt("options", 0)) != paramInt) {
      return false;
    }
    return true;
  }
  
  public final void aJ_() {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((irp)this.bo.a(irp.class));
    this.ad = ((irl)this.bo.a(irl.class));
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.a.add(this);
    this.ag = localgzj;
    this.ai = ((jov)this.bo.a(jov.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("STATE_CURRENT_PHOTO_PATH", this.ac);
    if (this.a == -1) {}
    for (int i = this.c.getFirstVisiblePosition();; i = this.a)
    {
      paramBundle.putInt("STATE_SCROLL_POSITION", i);
      paramBundle.putBoolean("STATE_ALL_PHOTOS_OPTION", this.aa);
      return;
    }
  }
  
  public final void m()
  {
    super.m();
    this.b.b.add(this);
  }
  
  public final void n()
  {
    super.n();
    this.b.b.remove(this);
  }
  
  public final void o()
  {
    this.c.setAdapter(null);
    k().a(1);
    super.o();
  }
  
  public final void v()
  {
    if (i())
    {
      if (Build.VERSION.SDK_INT >= 23)
      {
        jpd localjpd = this.aj;
        mbf localmbf = this.bn;
        if (localjpd.a(localmbf, "android.permission.READ_EXTERNAL_STORAGE") != 0) {}
      }
      else
      {
        k().a(1, null, this);
      }
    }
    else {
      return;
    }
    a(null);
  }
  
  public final void w()
  {
    this.ai.a(this.aj, efj.PP, y());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediapicker.MediaPickerFragment
 * JD-Core Version:    0.7.0.1
 */