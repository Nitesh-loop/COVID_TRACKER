package com.nitesh.covidtracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
                                                                    //something changed here, constructor
class StateRVAdapter (private val stateList:List<StateModel>) : RecyclerView.Adapter<StateRVAdapter.StateRVViewHolder>() {

    class StateRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val stateNameTV:TextView = itemView.findViewById(R.id.idTVState)
        val caseTV:TextView = itemView.findViewById(R.id.idTVCases)
        val deathsTV:TextView = itemView.findViewById(R.id.idTVDeaths)
        val recoveredTV:TextView = itemView.findViewById(R.id.idTVRecovered)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRVViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.state_rv_item,parent,false)
        return StateRVViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return stateList.size
    }

    override fun onBindViewHolder(holder: StateRVViewHolder, position: Int) {
        val sateData = stateList[position]
        holder.caseTV.text = sateData.cases.toString()
        holder.stateNameTV.text = sateData.state
        holder.deathsTV.text = sateData.deaths.toString()
        holder.recoveredTV.text = sateData.recovered.toString()
    }
}