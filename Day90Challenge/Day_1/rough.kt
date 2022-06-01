package Basic_To_Advanced_DataStructure.Day90Challenge.Day_1//package Basic_To_Advanced_DataStructure.Day90Challenge.Day_1
//
//import android.util.Log
//import com.saveo.saveomedical.R
//import com.saveo.saveomedical.databinding.FragmentWsProductListBinding
//import com.saveo.saveomedical.ui.base.FragmentBaseV2
//import com.saveo.saveomedical.ui.component.common.PaginationScroller
//import com.saveo.saveomedical.utils.isZero
//
//class FragmentWsProductList : FragmentBaseV2<FragmentWsProductListBinding>(),
//    PaginationScroller.Listener {
//
//    private val viewModel by lazy { getViewModel<WsProductVM>() }
//    private var paginationScroller: PaginationScroller? = null
//
//    override fun init() {
//        initUI()
//        initObservers()
//    }
//
//    private fun initUI() {
//        paginationScroller = PaginationScroller(this)
//        paginationScroller?.let { ps -> binding.recyclerView.addOnScrollListener(ps) }
//        loadMoreItems(0)
//    }
//
//    override fun setUpInsets() {
//        setStatusBarPaddingView(binding.header.topFl.topFl)
//        setSystemNavigationPaddingView(binding.recyclerView)
//    }
//
//    private fun initObservers() {
//        val adapter = WsProductAdapter()
//        binding.recyclerView.adapter = adapter
//        viewModel.wsMedicineList.observe(viewLifecycleOwner) {
//            adapter.setItems(it)
//            paginationScroller?.setPage(0, it.size.isZero())
//        }
//    }
//
//    override fun loadMoreItems(page: Int) {
//        viewModel.fetchProductData()
//    }
//
//    override val lightStatusBar: Boolean
//        get() = false
//
//    override fun layoutId() = R.layout.fragment_ws_product_list
//
//    override fun getScreenName(): String? = null
//}
//
//
////viewmodel
//
//class WsProductVM(app: Application) : ViewModelBase(app) {
//
//    private val repository by lazy { WsProductRepository(app) }
//
//    val wsMedicineList = MutableLiveData<List<WsMedicine>>()
//
//    val medicineList = mutableListOf<WsMedicine>()
//
//    val sellerDetailsList = MutableLiveData<List<SellerDetails>>()
//
//    val medicinePrice = MutableLiveData<Double>()
//
//    fun fetchProductData() {
//        runApiCall(
//            { repository.fetchProducts() },
//            {
//                it?.medicinesResponsesList?.let { it1 -> medicineList.addAll(it1) }
//                wsMedicineList.postValue(medicineList)
//            }
//        )
//    }
//
//    fun getSellerDetailsList(medicineId: String) {
//        runApiCall(
//            { repository.getSellerDataList(medicineId) },
//            { sellerDetailsList.postValue(it) }
//        )
//    }
//
//    fun getPrice(medicineId: String, qty: Int) {
//        runApiCall(
//            { repository.getPrice(medicineId, qty) },
//            { medicinePrice.postValue(it) }
//        )
//    }
//
//}
//
//
////Repository
//
//class WsProductRepository(context: Context) : RepositoryBase(context) {
//
//    suspend fun fetchProducts() =
//        makeApiCall { it.fetchWsMedicineList("home/v2/getMedicineByCategory?category=SURGICAL&filterCondition=all&page=0") }
//
//    suspend fun getSellerDataList(medicineId: String): Response<BaseResponse<List<SellerDetails>>> =
//        makeApiCall {
//            delay(5000)
//            return@makeApiCall Response.success(
//                BaseResponse(
//                    getSellerList(medicineId)
//                )
//            )
//
//        }
//
//    private fun getSellerList(medicineId: String): List<SellerDetails> {
//        val slabList = mutableListOf<SlabData>()
//        for (i in 1..5) {
//            if (i % 2 == 1) slabList.add(SlabData(7000, 10.0))
//            else slabList.add(SlabData(8000, 12.0))
//        }
//
//        val breakUpList = mutableListOf<BreakUpData>()
//        breakUpList.add(BreakUpData("Trade Rate", 65.64, false))
//        breakUpList.add(BreakUpData("Scheme (5+1)", 10.02, false))
//        breakUpList.add(BreakUpData("Cash Disc. (10%)", 15.64, true))
//        breakUpList.add(BreakUpData("GST (18%)", 5.64, false))
//
//        val sellerDataListBR = mutableListOf<SellerData>()
//        sellerDataListBR.add(
//            SellerData(
//                1,
//                53.2,
//                1649164697000,
//                "First Pharmacy",
//                50000,
//                53.20,
//                breakUpList,
//                slabList, "2-4 days"
//            )
//        )
//
//        val sellerDetailsList = mutableListOf<SellerDetails>()
//
//        sellerDetailsList.add(
//            SellerDetails(
//                "BR",
//                "Best Rate",
//                "Upto 20% CD",
//                sellerDataListBR
//            )
//        )
//
//        val sellerDataListBD = mutableListOf<SellerData>()
//
//        sellerDataListBD.add(
//            SellerData(
//                2,
//                64.67,
//                1649164697000,
//                "Second Pharmacy",
//                60000,
//                64.67,
//                breakUpList,
//                slabList,
//                "1-2 days"
//            )
//        )
//
//        sellerDetailsList.add(
//            SellerDetails(
//                "BD",
//                "Best Delivery",
//                "1-2 Days",
//                sellerDataListBD
//            )
//        )
//
//        val sellerDataListOTH = mutableListOf<SellerData>()
//
//        sellerDataListOTH.add(
//            SellerData(
//                3,
//                78.9,
//                1649164697000,
//                "Third Pharmacy",
//                40000,
//                78.9,
//                breakUpList,
//                slabList, "4-5 days"
//            )
//        )
//
//        sellerDataListOTH.add(
//            SellerData(
//                4,
//                89.78,
//                1649164697000,
//                "Fourth Pharmacy",
//                60000,
//                89.78,
//                breakUpList,
//                slabList, "5-6 days"
//            )
//        )
//
//        sellerDataListOTH.add(
//            SellerData(
//                5,
//                90.56,
//                1649164697000,
//                "Fifth Pharmacy",
//                60000,
//                90.56,
//                breakUpList,
//                slabList, "8-10 days"
//            )
//        )
//
//        sellerDataListOTH.add(
//            SellerData(
//                6,
//                91.45,
//                1649164697000,
//                "Sixth Pharmacy",
//                60000,
//                91.45,
//                breakUpList,
//                slabList, "6-8 days"
//            )
//        )
//
//        sellerDataListOTH.add(
//            SellerData(
//                7,
//                94.56,
//                1649164697000,
//                "Seventh Pharmacy",
//                60000,
//                94.56,
//                breakUpList,
//                slabList, "10-15 days"
//            )
//        )
//
//        sellerDetailsList.add(SellerDetails("OTH", "Others", "", sellerDataListOTH))
//
//        return sellerDetailsList
//
//    }
//
//    suspend fun getPrice(medicineId: String, qty: Int): Response<BaseResponse<Double>> =
//        makeApiCall {
//            return@makeApiCall Response.success(
//                BaseResponse(
//                    53.20 * qty
//                )
//            )
//        }
//}