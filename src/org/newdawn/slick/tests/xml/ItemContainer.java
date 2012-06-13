package org.newdawn.slick.tests.xml;

import java.util.ArrayList;

/**
 * A test example of some object data that can be configured via XML
 * 
 * @author kevin
 */
public class ItemContainer extends Item
{
	/** The items held in this container */
	private ArrayList<Item> items = new ArrayList<Item>();
	
	/**
	 * Called by XML parser to add a configured item to the entity
	 * 
	 * @param item The item to be added
	 */
	@SuppressWarnings( "unused" )
	private void add( Item item )
	{
		items.add( item );
	}
	
	/**
	 * Called by the XML to set the name attribute. Note that set methods can
	 * be used as well as direct field injection. In this case the setter *has*
	 * to be used to access the protected field from the super class
	 * 
	 * @param name The value to set
	 */
	@SuppressWarnings( "unused" )
	private void setName( String name )
	{
		this.name = name;
	}
	
	/**
	 * Called by the XML to set the condition attribute. Note that set methods can
	 * be used as well as direct field injection. In this case the setter *has*
	 * to be used to access the protected field from the super class
	 * 
	 * @param condition The value to set
	 */
	@SuppressWarnings( "unused" )
	private void setCondition( int condition )
	{
		this.condition = condition;
	}
	
	/**
	 * Dump this object to sysout
	 * 
	 * @param prefix The prefix to apply to all lines
	 */
	@Override
	public void dump( String prefix )
	{
		System.out.println( prefix + "Item Container " + name + "," + condition );
		for( int i = 0; i < items.size(); i++ )
		{
			items.get( i ).dump( prefix + "\t" );
		}
	}
}
