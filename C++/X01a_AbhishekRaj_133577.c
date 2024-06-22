#include <stdio.h>
#include <stdlib.h>


struct Node
{
    int data;
    struct Node *next;
};

struct Node *NewNode(int val)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = val;
    newNode->next = NULL;
    return newNode;
}

struct Node *insertbegin(struct Node *head, int val)
{
    struct Node *newNode = NewNode(val);
    if (head == NULL)
    {
        head = newNode;
    }
    else{
        newNode->next = head;
        head = newNode;
    }
    return head;
}

struct Node* insertend(struct Node* head,int val){
    struct Node *newNode = NewNode(val);
    if(head==NULL){
        return newNode;
    }
    struct Node* temp = head;
    while(temp->next){
        temp = temp->next;
    }
    temp->next = newNode;

    return head;
}

struct Node* deletefirst(struct Node* head){
    if(head==NULL){
        printf("\tCannot delete as NO nodes in the linked-list\n");
        return NULL;
    }
    struct Node* temp = head;
    head = head->next;
    free(temp);

    return head;
}

struct Node* deletelast(struct Node* head){
    if(head==NULL){
        printf("\tCannot delete as NO nodes in the linked-list\n");
        return NULL;
    }
    if(head->next==NULL)return deletefirst(head);

    struct Node* temp = head;
    while(temp->next->next){
        temp = temp->next;
    }
    temp->next = NULL;
    free(temp->next);

    return head;
}

struct Node* deletespecific(struct Node* head,int val){
    if(head==NULL){
        printf("\tCannot delete as no such node in the linked-list\n");
        return NULL;
    }
    if(head->data==val){
        struct Node* temp = head;
        head = head->next;
        free(temp);
        return head;
    }
    struct Node* temp = head;
    struct Node* prev = head;
    while(temp->next){
        if(temp->data == val){
            prev->next = temp->next;
            struct Node* del = temp;
            temp = temp->next;
            free(del);
            return head;
        }
        temp = temp->next;
    }
    printf("\tCannot delete as no such node in the linked-list\n");
    return head;
}

int finding(struct Node* head,int val){
    struct Node* temp = head;
    int cnt=0;
    while(temp){
        if(temp->data==val){
            printf("\tValue %d node is at position %d in the linked list\n",val,cnt+1);
            printf("\tDifference in its allocated memory to that of current head: %d\n",(&temp - &head));
            return 1;
        }
        temp = temp->next;
        cnt++;
    }
    return -1;
}

void printsize(struct Node* head){
    if(head==NULL)
    printf("\tSize of the linked list = 0\n");
    else{
        struct Node* temp = head;
        int cnt=0;
        while(temp->next){
            cnt++;
            temp = temp->next;
        }
        printf("\tSize of the linked list = %d\n",cnt+1);
    }
}

void show(struct Node* head){
    if(head==NULL)
    printf("Empty\n");
    else{
        struct Node* temp = head;
        printf("\tLinked list: ");
        while(temp){
            printf("%d",temp->data);
            if(temp->next!=NULL)
            printf(" => ");
            temp = temp->next;
        }
        printf("\n");
    }
}
struct Node* deletionofallnodes(struct Node* head){
    while(head){
        struct Node* temp = head;
        head = head->next;
        free(temp);
    }
    return head;
}

int main()
{
    struct Node *head = NULL;
    int n;
    printf("Enter the choice:\n");
    scanf("%d", &n);

    while(1){
        int x,flag=0;
        if(n==0){
            head = deletionofallnodes(head);
            break;
        }
        else if(n==1){
            printf("Enter the data value:\n");
            scanf("%d",&x);
            head = insertbegin(head,x);
        }
        else if(n==2){
            printf("Enter the data value:\n");
            scanf("%d",&x);
            head = insertend(head,x);
        }
        else if(n==3){
            head = deletefirst(head);
        }
        else if(n==4){
            head = deletelast(head);
        }
        else if(n==5){
            printf("Enter the data value:\n");
            scanf("%d",&x);
            head = deletespecific(head,x);
        }
        else if(n==6){
            printf("Enter the data value:\n");
            scanf("%d",&x);
            int val = finding(head,x);
            if(val==-1)
            printf("\tCannot find any such node in the linked-list\n");
            else{    
            }
        }
        else if(n==7){
            printsize(head);
        }
        else if(n==8){
            show(head);
        }
        else{
            printf("\tWrong Input.\nEnter your choice again:\n");
            scanf("%d",&n);
            flag=1;
        }
        if(flag==0){
            printf("Enter the choice:\n");
            scanf("%d",&n);
        }
    }

    return 0;
}