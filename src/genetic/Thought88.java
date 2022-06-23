package genetic;
import java.util.ArrayList;
class Thought88 extends Thought{
private static ArrayList<Thought88> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 524.7183227938074;
private double fd1 = 38.197663495710465;
private Thought fo0 = null;
private Thought fo1 = null;
Thought88 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought88 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought88 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought88 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought88 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought95.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought35.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = !ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought57.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab2 = ab3 || ab4;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    lb4 = ab1 && ab2;
    ab3 = fd1 < fd0;
    boolean lb5 = false;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 > fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
            boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[4][8] += fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought38.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 365.6998565331354;
    fb0 = !fb1;
    Output.points[5][0] += ad1;
    boolean lb2 = true;
    Output.points[5][1] -= ad2;
    lb2 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = ab1 && ab2;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld3 = 601.4775209150891;
    double ld4 = 789.0549874599402;
    Thought lo5 = Thought94.getInstance(ab4, fb0, fb1, lb2);
if(fo1 != null){
      ad4 = fo1.m3();
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ld3, ab4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    if (fb0) {
        fd0 = fd1 - fd0;
        fb1 = fb0 && fb1;
        Thought lo0 = Thought81.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
        fb0 = fd1 > fd0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ad1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought87.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    Output.points[5][2] -= fd0;
    fb0 = fd1 > ad1;
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    for(int i0=0; i0<10; i0++){
        Output.points[5][3] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought71.getInstance(ao1, ao2, ao3, ao4);
        Output.points[5][4] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought85.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
        Output.points[5][5] += fd1;
        Thought lo3 = Thought8.getInstance(ad1, ad2, ad3, ad4);
        fb1 = fd0 < fd1;
        }

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
        Thought lo0 = Thought23.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought41.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    boolean lb2 = false;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    lb3 = ab1 || ab2;
        ab3 = ab4 && fb0;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, lb3, ab1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought61.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    Output.points[5][6] -= ad2;
    Output.points[5][7] += ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[5][8] -= ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    double ld2 = 4.0233844949733095;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
    Output.points[6][0] -= ad4;
    boolean lb3 = true;
    Output.points[6][1] += fd0;
    double ld4 = 613.825666675494;
    boolean lb5 = false;
    fd0 *= -1;
    ab2 = fd1 > ld2;
    ld4 = ad1 - ad2;
    ab3 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    if (fb0) {
        Output.points[6][2] += fd1;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
        fb0 = fd0 < fd1;
        Output.points[6][3] -= fd0;
        fb1 = fd1 < fd0;
        Thought lo0 = Thought35.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought91.getInstance();
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    lb1 = lb2 || ab1;
    Thought lo3 = Thought16.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[6][4] -= fd0;
    fd1 = fd0 + fd1;
    double ld5 = 1.6179977681013193;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, lb4, ab1, ab2);
}
    ld5 = fd0 + fd1;
    ld5 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld5);
}
    Thought lo6 = Thought91.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
    fd1 = ld5 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[6][5] += fd1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        double ld0 = 299.54396883818026;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        }
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        lb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    Thought lo2 = Thought94.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2();
}
    boolean lb3 = false;
    Thought lo4 = Thought27.getInstance(ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][6] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb3 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, lb3);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    double ld5 = 664.7197608890314;
    Output.points[6][7] += ad4;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought23.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = fd0 > fd1;
        } else if (fb0) {
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = ad1 > ad2;
        ad3 *= -1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought57.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ad1;
    lb0 = ad2 < ad3;
    Thought lo2 = Thought39.getInstance(ao4, fo0, fo1, ao1);
    boolean lb3 = true;
    lb3 = ad4 < fd0;
    double ld4 = 331.08951741900347;
    Thought lo5 = Thought40.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld4, ad1, fb0, fb1, lb0, lb3);
    ad2 = ad3 + ad4;
    Thought lo6 = Thought47.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb3);
    Output.points[6][8] += fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought62.getInstance(fb1, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought73.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[7][0] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld2 = 933.3413994435954;
    Output.points[7][1] += ld2;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld2, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ld2 = ao3.m3();
}
    Thought lo3 = Thought22.getInstance(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, lb4, ab1, ab2, ab3);
}
    boolean lb5 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb4);
}

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] -= ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
    Output.points[7][3] -= ad4;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ao3.m2();
}
    double ld1 = 302.140271513617;
    Thought lo2 = Thought14.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, ad1);
}
    boolean lb3 = false;
    lb3 = !ab1;
    Thought lo4 = Thought29.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb3;
    if (ab1) {
        double ld5 = 709.4197750497653;
        double ld6 = 471.86796819927747;
if(fo0 != null){
          fo0.m1();
}
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 788.1815021760121;
    Output.points[7][4] += ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld1 = 184.024347017968;
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    Thought lo3 = Thought93.getInstance(ld0, ld1, fd0, fd1);
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought45.getInstance(ab4, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        Thought lo2 = Thought9.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || ab1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[7][5] -= fd1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, lb3, ab1, ab2);
}
    double ld4 = 169.97652654264073;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb3);
}
    fd0 = fd1 + ld4;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fb0 = !fb1;
    Thought lo0 = Thought60.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    double ld1 = 52.86175466948025;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought34.getInstance();
    fb0 = fb1 || fb0;
    fb1 = ad1 < ad2;
    double ld3 = 76.14813129108786;
    ad2 = ad3 - ad4;
    Thought lo4 = Thought6.getInstance(fd0, fd1, ld1, ld3, fb0, fb1, fb0, fb1);
    Output.points[7][6] += ad1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
    Output.points[7][7] -= ad3;
    boolean lb1 = true;
    Thought lo2 = Thought56.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    double ld4 = 273.09733663305235;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought16.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld4, ad1, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb3);
}
    fd1 = ld4 + ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3);
}
    Thought lo6 = Thought5.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
    Output.points[7][8] += ad4;
    boolean lb7 = true;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb8 = true;
    fd1 = ld4 + ad1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    Thought lo2 = Thought68.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought51.getInstance(fb1, lb0, lb1, fb0);
    fb1 = fd1 < fd0;
    Output.points[8][0] += fd1;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    Thought lo4 = Thought0.getInstance();
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[8][1] -= fd0;
    fb0 = !fb1;
    fd1 = ad1 + ad2;
        double ld0 = 131.47562198413786;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    Thought lo4 = Thought6.getInstance(lb2, lb3, fb0, fb1);
    fd1 = ld0 - ad1;
    lb1 = lb2 && lb3;
    fb0 = ad2 < ad3;
    double ld5 = 396.6541289708529;
    fb1 = lb1 || lb2;
if(ao2 != null){
      ao2.m1();
}
    double ld6 = 91.97733097369286;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought20.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    double ld2 = 677.8186213258045;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(lb0, ab1, ab2, ab3);
}
    ab4 = ld2 > fd0;
if(fo1 != null){
      fo1.m3();
}
    Output.points[8][2] -= fd1;
    Thought lo3 = Thought72.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[8][3] -= fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought19.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    double ld1 = 256.07780966108965;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    double ld2 = 409.04005561832616;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = ab1 && ab2;
    ld2 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[8][4] -= ld1;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 398.1123355155744;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    boolean lb2 = false;
    ld0 = fd0 - fd1;
    lb2 = ld0 > fd0;
    boolean lb3 = false;
    double ld4 = 448.80524621506964;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld4, fd0, lb3, fb0, fb1, lb1);
}
    Thought lo5 = Thought48.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld4, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld4, fd0);
}
if(fo0 != null){
      fo0.m1(lb1, lb2, lb3, lb6);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld4, fd0, fd1, fb0, fb1, lb1, lb2);
}
    lb3 = lb6 && fb0;
    double ld7 = 618.157579998141;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb0 = true;
    Thought lo1 = Thought89.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought84.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][5] += fd0;
    Output.points[8][6] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, ab1);
}
    fd1 = fd0 - fd1;
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought88.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Output.points[8][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 664.9483308259142;
if(fo1 != null){
      ad3 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
    boolean lb1 = true;
    Thought lo2 = Thought25.getInstance();
    boolean lb3 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    Thought lo4 = Thought27.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb1, lb3, ab1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb0, lb1);
}
    double ld2 = 197.29228702448322;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb1 = fd0 < fd1;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
    double ld3 = 97.71287520372185;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fd0 > fd1;
    ad1 *= -1;
    Thought lo0 = Thought39.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
        double ld1 = 550.510228573477;
    fb1 = fb0 && fb1;
    double ld2 = 208.16550660912065;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ld2, ad1);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += fd1;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    Thought lo1 = Thought95.getInstance(ao3, ao4, fo0, fo1);
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought0.getInstance();
    lb0 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb3 = true;
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    lb0 = lb3 || ab1;
    fd0 = fd1 + fd0;
    Output.points[0][0] += fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought88.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb0, ab1);
}
    double ld1 = 502.33545103714204;
    boolean lb2 = false;
    ab1 = ld1 > ad1;
    double ld3 = 351.22006292418735;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
            fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    double ld1 = 640.2689700975503;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb2 = fd0 > fd1;
    fb0 = ld1 < fd0;
    Thought lo3 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
    ld1 = fd0 - fd1;
    fb1 = lb0 || lb2;
    double ld4 = 777.7104360080484;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    Thought lo5 = Thought63.getInstance(ld1, ld4, fd0, fd1);
    ld1 = ld4 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 20.127545153057632;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        double ld1 = 72.69298928294393;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1);
}
    Thought lo3 = Thought36.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
    double ld4 = 417.84386615895534;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb2 || fb0;
    ld4 = fd0 - fd1;
    fb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ld4, fd0, fb1, lb2, fb0, fb1);
}
    fd1 = ld0 - ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought54.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 339.05756331668044;
    Thought lo2 = Thought40.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought77.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ld1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought88.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd1 = ld1 + fd0;
    fb0 = fd1 > ld1;
    fb1 = fd0 < fd1;
    double ld5 = 979.8295002515262;
    double ld6 = 975.1388512336396;
    boolean lb7 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
