package com.teamjeff.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teamjeff.myapplication.adapters.ItemAdapter
import com.teamjeff.myapplication.adapters.history_adapter
import com.teamjeff.myapplication.adapters.notification_adapter
import com.teamjeff.myapplication.data.data_offers
import com.teamjeff.myapplication.data.history_data


class HistoryFragment : Fragment() {

    private lateinit var adapter: history_adapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var list: ArrayList<history_data>

    lateinit var imageId: Array<Int>
    lateinit var description: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInit()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.history_recy)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = history_adapter(list)
        recyclerView.adapter = adapter

    }

    private fun dataInit() {
        list = arrayListOf<history_data>()
        imageId = arrayOf(
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
        )

        description = arrayOf(
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
            "Plant disease detected \nand disease is cured",
        )
        for (i in imageId.indices) {
            val value = history_data(imageId[i], description[i])
            list.add(value)
        }
    }

}