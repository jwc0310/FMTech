package parknshop.parknshopapp.Fragment.Product.ProductDetail;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import parknshop.parknshopapp.Base.BaseFragment;

/**
 * Created by chrisyu on 16/3/12.
 */
//308485 redemption pns
public class ProductFragment extends BaseFragment implements ViewPager.OnPageChangeListener{

    public static ProductFragment newInstance(int productId) {
        ProductFragment productFragment = new ProductFragment();

        Bundle args = new Bundle();
        args.putInt("productId", productId);
        productFragment.setArguments(args);

        return productFragment;
    }/*
    int productId;
    Product product;

    @Nullable @Bind(R.id.title) TextView title;
    @Nullable @Bind(R.id.small_description) TextView small_description;
    @Nullable @Bind(R.id.product_description_item) ImageView productDescriptionArrow;
    @Nullable @Bind(R.id.description) TextView description;
    ProductDescriptionArrowViewHolder productDescriptionArrowViewHolder;

    @Nullable @Bind(R.id.current_price) TextView currentPrice;
    @Nullable @Bind(R.id.original_price) TextView originalPrice;

    @Nullable @Bind(R.id.type) TextView type;
    @Nullable @Bind(R.id.country) TextView country;

    @Nullable @Bind(R.id.country_view) View countryView;
    @Nullable @Bind(R.id.new_view) View new_view;

    @Nullable @Bind(R.id.self_pick_up_view) View selfPickUpView;
    @Nullable @Bind(R.id.home_delivery_view) View homeDeliveryView;

    @Nullable @Bind(R.id.gallery_viewpager) ViewPager viewPager;
    @Nullable @Bind(R.id.ratingBar) RatingBar ratingBar;
    @Nullable @Bind(R.id.rating_count) TextView ratingCount;
    @Nullable @Bind(R.id.promotion_count) TextView promotionCount;
    //igcPromotionTag

    @Nullable @Bind(R.id.ingredient_wrapper) LinearLayout ingredientWrapper;
    @Nullable @Bind(R.id.ingredient_placeholder) TextView ingredientPlaceholder;
    @Nullable @Bind(R.id.ingredients) LinearLayout ingredientLayout;
    @Nullable public @Bind(R.id.add_to_cart_textview) TextView checkoutBtn;
    @Nullable public @Bind(R.id.disable) View checkoutDisableView;

    @Nullable @Bind(R.id.default_image) ImageView defaultImage;

    @Nullable @Bind(R.id.tutorial_dot_panel) LinearLayout tutorialPanel;
    public @Nullable @Bind(R.id.add_minus_count_panel) LinearLayout addMinusCountPanel;
    @Nullable @Bind(R.id.btnAddToWishList) ImageView btnAddToWishList;


    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productId = getArguments().getInt("productId");

        view = getActivity().getLayoutInflater().inflate(R.layout.product_detail_fragment, null);

        setToolbarTitle("");
        showBackButton();
        showShoppingCartButton();
        ButterKnife.bind(this, view);

        int screenWidth = Utils.getScreenWidth(getActivity());
        viewPager.setLayoutParams(new RelativeLayout.LayoutParams(screenWidth, (int) (screenWidth * 0.6)));

        setRatingBarLayout();
        getLoadingView().setVisibility(View.VISIBLE);
        WebServiceModel.getInstance(getActivity()).requestGetProduct(String.valueOf(productId));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(product != null)
            setProduct(product);
        return view;
    }


    HeaderViewPagerAdapter headerViewPagerAdapter;
    ShoppingCartAddMinusCountPanel scamcp;

    // Receive API callback response
    public void onEvent(ProductDetailEvent productDetailEvent){
        if(productDetailEvent.getSuccess() && productDetailEvent.product != null){
            product = productDetailEvent.product;
            setProduct(product);
            setGalleryPanel(product);

            product.setLastModifiedDate(new Date().getTime());

            HistoryHelper.addToList(getActivity(), product);

            updateWishListBtn();

            scamcp = new ShoppingCartAddMinusCountPanel(addMinusCountPanel, product, getBaseActivity());
            scamcp.isProductDetailController = true;

            getLoadingView().setVisibility(View.GONE);
        } else {
            ToastUtils.show(getActivity(), productDetailEvent.getMessage());
            getLoadingView().setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.share)
    public void share() {
        shareUrl();
    }

    @OnClick(R.id.locator)
    public void locator() {

    }

    @OnClick(R.id.reciple)
    public void recipe() {

    }

    @OnClick(R.id.add_to_cart)
    public void addToCart() {
        if(HomePresenter.getLocalShoppingCart().get(Integer.valueOf(product.getCode())) == null ||  HomePresenter.getLocalShoppingCart().get(Integer.valueOf(product.getCode())) == 0) {
            showProgressDialog();
            WebServiceModel.getInstance(getBaseActivity()).addShoppingCart(product.getCode(), Integer.valueOf(scamcp.countView.getText().toString()), getBaseActivity());
        } else {
            showProgressDialog();
            WebServiceModel.getInstance(getBaseActivity()).editShoppingCart(HomePresenter.getRemoteShoppingCart().getEntryById(product.getCode()).entryNumber, Integer.valueOf(scamcp.countView.getText().toString()), getBaseActivity());
        }
        HomePresenter.handleLocalShoppingCartData(Integer.valueOf(product.getCode()), Integer.valueOf(scamcp.countView.getText().toString()));
        //WebServiceModel.getInstance(getBaseActivity()).editShoppingCart(getEntryNumberByProductId(product.getCode()), countValue, baseActivity);
    }

    @OnClick (R.id.rating_panel)
    public void goToRatingPage() {
        if(product.getRatingList() == null || product.getRatingList().size() == 0)
            return;

        ProductCommentFragment productCommentFragment = new ProductCommentFragment();
        productCommentFragment.product = product;
        this.placeFragmentWithBackStack(productCommentFragment);
    }

    @OnClick (R.id.promotion_panel)
    public void goToPromotionPage() {
        if( product.getIgcPromotionTag() == null ||  product.getIgcPromotionTag().size() == 0)
            return;

        ProductPromotionFragment productPromotionFragment = new ProductPromotionFragment();
        productPromotionFragment.promotionList = product.getIgcPromotionTag();
        this.placeFragmentWithBackStack(productPromotionFragment);
    }

    public void setRatingBarLayout() {
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        Drawable progress = ratingBar.getProgressDrawable();
        DrawableCompat.setTint(progress, Color.YELLOW);
    }

    public void setProduct(Product product) {
        setToolbarTitle(product.getName());
        enableSecondRightButton();
        disableNavigationDrawer();
        showBackButton();
        title.setText(product.getBrandName());

        small_description.setText(selfPickUpView(product.getName()) + (product.getDescSpec() != null || product.getName() != null ? "," : "") + handEmptyString(product.getDescSpec()));

        description.setText(Html.fromHtml(product.getName()));

        currentPrice.setText(product.getPrice());

        if(product.getOldPrice() != null)
            originalPrice.setText("was " + product.getOldPrice());

        country.setText(product.getIgcInformativeText3());

        countryView.setVisibility(product.getIgcInformativeText3() == null || product.getIgcInformativeText3().length() == 0 ? View.GONE : View.VISIBLE);
        new_view.setVisibility(product.isIgcNewProduct() ? View.VISIBLE : View.GONE);
        //type.setText(product.getDescOrigin());

        if (product.getStorePickupAllowed()) {
            selfPickUpView.setVisibility(View.VISIBLE);
            homeDeliveryView.setVisibility(View.VISIBLE);
        } else {
            selfPickUpView.setVisibility(View.GONE);
            homeDeliveryView.setVisibility(View.VISIBLE);
        }


        ratingBar.setRating(product.getAverageRating());
        ratingCount.setText("(" + product.getNumberOfReviews()  + ")");
        promotionCount.setText("(" + product.getIgcPromotionTag().size() + ")");

        if(product.getIgcIngredients() != null) {
            IngredientViewHolder ingredientView = new IngredientViewHolder(getBaseActivity());
            ingredientView.init(getBaseActivity());
            ingredientView.setIngredientItem(Html.fromHtml(product.getIgcIngredients()).toString());
            ingredientView.setIngredientWeight("100 g");
            ingredientLayout.addView(ingredientView.getView());

            IngredientViewHolder ingredientView2 = new IngredientViewHolder(getBaseActivity());
            ingredientView2.init(getBaseActivity());
            ingredientView2.setIngredientItem(Html.fromHtml(product.getIgcIngredients()).toString());
            ingredientView2.setIngredientWeight("200 g");
            ingredientLayout.addView(ingredientView2.getView());

            productDescriptionArrow.setVisibility(View.VISIBLE);

            productDescriptionArrowViewHolder = new ProductDescriptionArrowViewHolder(productDescriptionArrow, ingredientWrapper);
        } else {
            ingredientWrapper.setVisibility(View.GONE);
        }
        //product.getStorePickupAllowed()
        //
    }

    public void setGalleryPanel(Product product) {
        Glide.with(getBaseActivity()).load(R.drawable.food_default).into(defaultImage);

        headerViewPagerAdapter = new HeaderViewPagerAdapter(getFragmentManager());

        headerViewPagerAdapter.centerInside = true;

        List<ImageData> productImageList = new ArrayList<ImageData>();
        for (int i = 0; i < product.getImages().size(); i++) {
            if (product.getImages().get(i).isAdProductImage()) {
                productImageList.add(product.getImages().get(i));
                defaultImage.setVisibility(View.GONE);
            }
        }
        headerViewPagerAdapter.setList(product.getImages());

        Log.i("defaultImage", "defaultImage" + product.getImages().size() );
        headerViewPagerAdapter.setCount(productImageList.size());

        viewPager.setAdapter(headerViewPagerAdapter);
        viewPager.setOnPageChangeListener(this);

        TutorialPresenter.initProductDotPanel(tutorialPanel, getActivity(), productImageList.size());
    }

    @OnClick(R.id.btnAddToWishList)
    public void btnAddToWishList(){
        if(alreadyAdded)
            ToastUtils.show(getBaseActivity(), "Already Added");
        ((OneActivity) getActivity()).addToWishList(product);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        TutorialPresenter.redrawDotPanel(tutorialPanel, position, headerViewPagerAdapter.getCount());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public String handEmptyString(String s) {
        if(s == null || s.length() == 0) return "";
        return s;

    }

    boolean alreadyAdded;
    public void updateWishListBtn() {
        WishListResponse[] wishListResponses = Hawk.get(AppUtils.grocery_list);

        if(product == null || wishListResponses == null) {
            return;
        }

        for(WishListResponse wishListResponse : wishListResponses){
            for(WishListResponse.Entry entry : wishListResponse.getEntries()) {
                if (entry.getProduct().getCode().equals(product.getCode())){
                    Glide.with(getActivity()).load(R.drawable.on_sale_tag_heart).into(btnAddToWishList);
                    alreadyAdded = true;
                    continue;
                }
            }
        }
    }

    public void onEvent(WishListUpdatedEvent wishListUpdatedEvent) {
        updateWishListBtn();
    }

    public void onEvent(CartEvent cartEvent) {
        super.onEvent(cartEvent);
        //if(cartEvent.getSuccess())
        //    ToastUtils.show(getBaseActivity(), "Cart Updated");
    }

    @OnClick (R.id.description_panel)
    public void onClickDescriptionPanel() {
        if(productDescriptionArrowViewHolder != null)
            productDescriptionArrowViewHolder.onItemClick();
    }


}
*/

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}