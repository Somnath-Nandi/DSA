// Write a program to check if an entered key exists in the key-value pair array or not and print 'True' , if key exists otherwise print 'False'. 

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int key;
    int value;
    struct node *next;
};
struct table
{
    int size;
    struct node **list;
};
struct table *createTable(int size)
{
    struct table *t = (struct table *)malloc(sizeof(struct table));
    t->size = size;
    t->list = (struct node **)malloc(sizeof(struct node *) * size);
    int i;
    for (i = 0; i < size; i++)
        t->list[i] = NULL;
    return t;
}
int hashCode(struct table *t, int key)
{
    if (key < 0)
        return -(key % t->size);
    return key % t->size;
}
void insert(struct table *t, int key, int value)
{
    int pos = hashCode(t, key);
    struct node *list = t->list[pos];
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    struct node *temp = list;
    while (temp)
    {
        if (temp->key == key)
        {
            temp->value = value;
            return;
        }
        temp = temp->next;
    }
    newNode->key = key;
    newNode->value = value;
    newNode->next = list;
    t->list[pos] = newNode;
}
int Iskeyexist(struct table *t, int key)
{
    int pos = hashCode(t, key);
    struct node *temp = t->list[pos];

    while (temp != NULL)
    {
        if (temp->key == key)
            return 1;
        temp = temp->next;
    }
    return -1;
}
int main()
{
    struct table *t = createTable(5);
    int n;
    scanf("%d", &n);
    int key[n], value[n];
    for (int i = 0; i < n; i++)
        scanf("%d", &key[i]);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &value[i]);
        insert(t, key[i], value[i]);
    }
    int search_key;
    scanf("%d", &search_key);
    int x = (Iskeyexist(t, search_key));
    if (x == -1)
    {
        printf("False");
    }
    else
    {
        printf("True");
    }
    return 0;
}