/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.blogs.service;

/**
 * <a href="BlogsEntryLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class BlogsEntryLocalServiceUtil {
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.dynamicQuery(queryInitializer);
	}

	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int begin, int end) throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.dynamicQuery(queryInitializer, begin, end);
	}

	public static com.liferay.portlet.blogs.model.BlogsEntry addEntry(
		java.lang.String userId, java.lang.String plid, long categoryId,
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.addEntry(userId, plid, categoryId, title,
			content, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute, addCommunityPermissions,
			addGuestPermissions);
	}

	public static com.liferay.portlet.blogs.model.BlogsEntry addEntry(
		java.lang.String userId, java.lang.String plid, long categoryId,
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.addEntry(userId, plid, categoryId, title,
			content, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute, communityPermissions,
			guestPermissions);
	}

	public static com.liferay.portlet.blogs.model.BlogsEntry addEntry(
		java.lang.String userId, java.lang.String plid, long categoryId,
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.addEntry(userId, plid, categoryId, title,
			content, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute, addCommunityPermissions,
			addGuestPermissions, communityPermissions, guestPermissions);
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	public static void addEntryResources(
		com.liferay.portlet.blogs.model.BlogsEntry entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.addEntryResources(entryId, communityPermissions,
			guestPermissions);
	}

	public static void addEntryResources(
		com.liferay.portlet.blogs.model.BlogsEntry entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.addEntryResources(entry, communityPermissions,
			guestPermissions);
	}

	public static void deleteEntries(long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.deleteEntries(groupId);
	}

	public static void deleteEntry(long entryId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.deleteEntry(entryId);
	}

	public static void deleteEntry(
		com.liferay.portlet.blogs.model.BlogsEntry entry)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.deleteEntry(entry);
	}

	public static int getCategoriesEntriesCount(java.util.List categoryIds)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getCategoriesEntriesCount(categoryIds);
	}

	public static java.util.List getEntries(long categoryId, int begin, int end)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getEntries(categoryId, begin, end);
	}

	public static int getEntriesCount(long categoryId)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getEntriesCount(categoryId);
	}

	public static com.liferay.portlet.blogs.model.BlogsEntry getEntry(
		long entryId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getEntry(entryId);
	}

	public static java.util.List getGroupEntries(long groupId, int begin,
		int end) throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getGroupEntries(groupId, begin, end);
	}

	public static int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getGroupEntriesCount(groupId);
	}

	public static java.lang.String getGroupEntriesRSS(long groupId, int begin,
		int end, java.lang.String type, double version, java.lang.String url)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.getGroupEntriesRSS(groupId, begin, end,
			type, version, url);
	}

	public static void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();
		blogsEntryLocalService.reIndex(ids);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		java.lang.String companyId, long groupId, java.lang.String userId,
		java.lang.String[] categoryIds, java.lang.String keywords)
		throws com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.search(companyId, groupId, userId,
			categoryIds, keywords);
	}

	public static com.liferay.portlet.blogs.model.BlogsEntry updateEntry(
		java.lang.String userId, long entryId, long categoryId,
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		BlogsEntryLocalService blogsEntryLocalService = BlogsEntryLocalServiceFactory.getService();

		return blogsEntryLocalService.updateEntry(userId, entryId, categoryId,
			title, content, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute);
	}
}