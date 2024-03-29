SELECT ii.ITEM_ID, ii.ITEM_NAME, ii.RARITY
FROM ITEM_INFO AS ii
    JOIN ITEM_TREE AS it ON ii.ITEM_ID = it.ITEM_ID
    JOIN ITEM_INFO AS parent ON it.PARENT_ITEM_ID = parent.ITEM_ID
WHERE parent.RARITY = 'RARE'
ORDER BY ii.ITEM_ID DESC;
