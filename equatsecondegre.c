#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float delta(float x, float y, float z)
{
  return (y*y - 4*x*z);
}

int main()
{
  float a,b,c,i,x0,x1,x2;

  printf("BONJOURRR!!!CE PROGRAMME VOUS PERMET DE RESOUDRE UNE EQUATION DU SECOND DEGRE\n\n");

      do
      {
          printf("ENTRER LE COEFFICIENT DE X^2\n");
          scanf("%f",&a);
          printf("ENTRER LE COEFFICIENT DE X\n");
          scanf("%f",&b);
          printf("ENTRER LE COEFFICIENT DE X^0\n");
          scanf("%f",&c);
          //delta = b*b - 4*a*c;
          if(delta(a, b, c)<0)
          {
            printf("L'EQUATION %f*X^2 + %f*X + %f = 0 N'ADMET PAS DE SOLUTION\n\n",a,b,c);

          }
          else if(delta(a, b, c) == 0)
          {
              x0 = (-b - sqrt(delta(a, b, c)))/2*a;
              printf("L'EQUATION %f*X^2 + %f*X + %f = 0 ADMET UNE SEUL SOLUTION S = {%f}\n\n",a,b,c,x0);
          }
          else if(delta(a, b, c) > 0)
          {
              x1 = (-b - sqrt(delta(a, b, c)))/2*a;
              x2 = (-b + sqrt(delta(a, b, c)))/2*a;
              printf("L'EQUATION %f*X^2 + %f*X + %f = 0 ADMET UNE SOLUTION DOUBLE S = {%f,%f}\n\n",a,b,c,x1,x2);
          }
          printf("SOUHAITEZ VOUS OBTENIR LA SOLUTION D'UNE AUTRE EQUATION ? SI OUI TAPEZ 1 SINON TAPER 0\n\n");
          scanf("%f",&i);

      }while(i==1);

      printf("MERCI D'UTILISER CE PROGRAMME POUR LA RESOLUTION DE VOS FUTURE EQUATION DU SECOND DEGRE\n " );

    return 0;
}

