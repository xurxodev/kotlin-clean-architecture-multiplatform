package com.xurxodev.multiplatformexample.android

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xurxodev.multiplatformexample.android.dummy.DummyContent
import kotlinx.android.synthetic.main.fragment_product_list.view.*

class ProductListFragment : Fragment() {

    private var twoPane: Boolean = false
    private lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ProductListFragment.ARG_TWO_PANE)) {
                this.twoPane = it.getBoolean(ProductListFragment.ARG_TWO_PANE)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rootView = inflater.inflate(R.layout.fragment_product_list, container, false)

        setupRecyclerView()

        return rootView
    }

    private fun setupRecyclerView() {
        val adapter = SimpleItemRecyclerViewAdapter { view ->
            val item = view.tag as DummyContent.DummyItem
            if (twoPane) {
                val productDetailFragment = ProductDetailFragment.newInstance(item.id)

                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.home_right_container, productDetailFragment)?.commit()
            } else {
                val intent = Intent(view.context, ProductDetailActivity::class.java).apply {
                    putExtra(ProductDetailFragment.ARG_ITEM_ID, item.id)
                }
                view.context.startActivity(intent)
            }
        }

        rootView.product_list.adapter = adapter

        adapter.values = DummyContent.ITEMS
    }

    companion object {
        private const val ARG_TWO_PANE = "twoPane"

        fun newInstance(twoPane: Boolean): ProductListFragment = ProductListFragment().apply {
            arguments = Bundle().apply {
                putBoolean(ProductListFragment.ARG_TWO_PANE, twoPane)
            }
        }
    }
}
