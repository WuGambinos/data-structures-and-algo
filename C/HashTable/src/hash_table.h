/*
 * =====================================================================================
 *
 *       Filename:  hash_table.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  8/6/2021 8:58:54 PM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  YOUR NAME (), 
 *   Organization:  
 *
 * =====================================================================================
 */


typedef struct {
  char* key;
  char* value;

}ht_item;

typedef struct {
  int size;
  int count;
  ht_item** items;
} ht_hash_table;

