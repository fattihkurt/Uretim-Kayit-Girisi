package crc64c4109e38bafbaf7d;


public class NativeZoomViewRenderer
	extends crc644b19d71eeb53ff67.AndroidRendererBase_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.PrimitivesRenderer.Android.NativeZoomViewRenderer, Telerik.XamarinForms.Primitives", NativeZoomViewRenderer.class, __md_methods);
	}


	public NativeZoomViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeZoomViewRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.NativeZoomViewRenderer, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public NativeZoomViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NativeZoomViewRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.NativeZoomViewRenderer, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public NativeZoomViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NativeZoomViewRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.NativeZoomViewRenderer, Telerik.XamarinForms.Primitives", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
