/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.ir;

import java.util.ArrayList;

/**
 * Cell type
 * 
 * Cell type is used by Row, which is the base element of the table item and
 * grid item.
 * 
 */
public class CellDesign extends ReportItemDesign
{

	/**
	 * column id.
	 */
	protected int column = -1;
	/**
	 * column span
	 */
	protected int colSpan = 1;
	/**
	 * row span
	 */
	protected int rowSpan = 1;
	/**
	 * describe the drop.
	 */
	protected String drop;
	/**
	 * content in this cell
	 */
	protected ArrayList contents = new ArrayList( );
	/**
	 * If group icon should be displayed in this cell.
	 */
	private boolean displayGroupIcon = false;
	/**
	 * The number of the diagonal line.
	 */
	private int diagonalNumber = -1;
	/**
	 * The style of the diagonal line.
	 */
	private String diagonalStyle = null;
	/**
	 * The width of the diagonal line.
	 */
	private DimensionType diagonalWidth = null;
	/**
	 * The number of the antidiagonal line.
	 */
	private int antidiagonalNumber = -1;
	/**
	 * The style of the antidiagonal line.
	 */
	private String antidiagonalStyle = null;
	/**
	 * The width of the antidiagonal line.
	 */
	private DimensionType antidiagonalWidth = null;
	
	private String headers;

	private String scope;

	/**
	 * @return Returns the colSpan.
	 */
	public int getColSpan( )
	{
		return colSpan;
	}

	/**
	 * @param colSpan
	 *            The colSpan to set.
	 */
	public void setColSpan( int colSpan )
	{
		this.colSpan = colSpan;
	}

	/**
	 * @return Returns the column.
	 */
	public int getColumn( )
	{
		return column;
	}

	/**
	 * @param column
	 *            The column to set.
	 */
	public void setColumn( int column )
	{
		this.column = column;
	}

	/**
	 * @return count of the content items.
	 */
	public int getContentCount( )
	{
		return this.contents.size( );
	}

	/**
	 * get the content of index.
	 * 
	 * @param index
	 *            content index
	 * @return Returns the content.
	 */
	public ReportItemDesign getContent( int index )
	{
		assert index >= 0 && index < this.contents.size( );
		return (ReportItemDesign) this.contents.get( index );
	}

	/**
	 * add content into the cell.
	 * 
	 * @param content
	 *            The content to set.
	 */
	public void addContent( ReportItemDesign content )
	{
		this.contents.add( content );
	}

	/**
	 * @return Returns the rowSpan.
	 */
	public int getRowSpan( )
	{
		return rowSpan;
	}

	/**
	 * @param rowSpan
	 *            The rowSpan to set.
	 */
	public void setRowSpan( int rowSpan )
	{
		this.rowSpan = rowSpan;
	}

	/**
	 * @return Returns the drop.
	 */
	public String getDrop( )
	{
		return drop;
	}

	/**
	 * @param drop
	 *            The drop to set.
	 */
	public void setDrop( String drop )
	{
		this.drop = drop;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.ReportItemDesign#accept(org.eclipse.birt.report.engine.ir.IReportItemVisitor)
	 */
	public Object accept( IReportItemVisitor visitor, Object value )
	{
		return visitor.visitCell(this, value);
	}

	public void setDisplayGroupIcon( boolean displayGroupIcon )
	{
		this.displayGroupIcon = displayGroupIcon;
	}
	
	public boolean getDisplayGroupIcon( )
	{
		return displayGroupIcon;
	}

	public void setDiagonalNumber( int diagonalNumber )
	{
		this.diagonalNumber = diagonalNumber;
	}

	public int getDiagonalNumber( )
	{
		return diagonalNumber;
	}

	public void setDiagonalStyle( String diagonalStyle )
	{
		this.diagonalStyle = diagonalStyle;
	}

	public String getDiagonalStyle( )
	{
		return diagonalStyle;
	}

	public void setDiagonalWidth( DimensionType diagonalWidth )
	{
		this.diagonalWidth = diagonalWidth;
	}

	public DimensionType getDiagonalWidth( )
	{
		return diagonalWidth;
	}

	public void setAntidiagonalNumber( int antidiagonalNumber )
	{
		this.antidiagonalNumber = antidiagonalNumber;
	}

	public int getAntidiagonalNumber( )
	{
		return antidiagonalNumber;
	}

	public void setAntidiagonalStyle( String antidiagonalStyle )
	{
		this.antidiagonalStyle = antidiagonalStyle;
	}

	public String getAntidiagonalStyle( )
	{
		return antidiagonalStyle;
	}

	public void setAntidiagonalWidth( DimensionType antidiagonalWidth )
	{
		this.antidiagonalWidth = antidiagonalWidth;
	}

	public DimensionType getAntidiagonalWidth( )
	{
		return antidiagonalWidth;
	}

	public void setHeaders( String headers )
	{
		this.headers = headers;
	}

	public String getHeaders( )
	{
		return this.headers;
	}

	public void setScope( String scope )
	{
		this.scope = scope;
	}

	public String getScope( )
	{
		return this.scope;
	}
}
