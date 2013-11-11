package com.twix.tailoredtravels;

import java.util.LinkedList;

/**
 * A class used to maintain an ordered list of 
 * Waypoints to send to Google Earth.
 * 
 * @author Stephen Moore
 *
 */
public class GoogleEarthPath {

	/**
	 * LinkedList associated with the path of Waypoints.
	 */
	private LinkedList<Waypoint> wPath = new LinkedList<Waypoint>();
	
	/**
	 * Initiates a new Google Earth path to be translated into KML.
	 * 
	 * @param _start Thw beginning Waypoint
	 * @param _end The final Waypoint
	 */
	public GoogleEarthPath(Waypoint _start, Waypoint _end)
	{
		this.wPath.add(_start);
		this.wPath.add(_end);
	}
	
	/**
	 * Adds a new Waypoint ot the path, immediately before the end.
	 * 
	 * @param _new The Waypoint to add
	 */
	public void addWaypoint(Waypoint _new)
	{
		Waypoint _temp = this.wPath.pollLast();
		this.wPath.add(_new);
		this.wPath.add(_temp);
	}
}