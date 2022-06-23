package genetic;
import java.util.ArrayList;
class Thought99 extends Thought{
private static ArrayList<Thought99> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 238.81553425829347;
private double fd1 = 150.72842193297865;
private Thought fo0 = null;
private Thought fo1 = null;
Thought99 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought99 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought99 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought99 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought99 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Output.points[7][5] += fd0;
    Thought lo0 = Thought49.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 11.569983010843256;
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m1();
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld1;
        Thought lo2 = Thought70.getInstance(fo0, fo1, fo0, fo1);
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought37.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fd1 > ld1;
        fd0 *= -1;
        fb1 = fb0 || fb1;
        fb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        Thought lo4 = Thought24.getInstance(fb0, fb1, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
        Thought lo0 = Thought41.getInstance();
    Output.points[7][6] += fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[7][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1(lb1, lb2, ab1, ab2);
}
    Thought lo4 = Thought22.getInstance();
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb1 = lb2 && ab1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
        fb1 = fb0 && fb1;
    ad4 = fd0 - fd1;

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
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    double ld1 = 604.3077644455664;
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
        ld1 *= -1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb0 = !ab1;
if(fo1 != null){
      ld1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb3);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    if (fb1) {
        fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        Output.points[7][8] -= fd1;
        fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd1 = fd0 + fd1;
        fb0 = !fb1;
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fb0 = fd0 > fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
        lb1 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
          lb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        fb0 = !fb1;
        boolean lb2 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
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
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Output.points[8][0] += ad1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    lb0 = !fb0;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
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
    fd1 *= -1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab4 = !fb0;
    Output.points[8][1] += fd1;
    Thought lo1 = Thought23.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = false;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb2;
    fd0 = fd1 + fd0;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        ad2 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb2, lb0, lb1, ab1);
}
        Output.points[8][2] -= ad1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        double ld3 = 155.25122975857118;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(ld3, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3);
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, lb4);
}
        Thought lo5 = Thought55.getInstance();
        Thought lo6 = Thought22.getInstance(ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld1 = 272.03285125112967;
    for(int i0=0; i0<10; i0++){
        fb1 = ld1 > fd0;
        double ld2 = 725.6631370593301;
        fb0 = !fb1;
        fd0 = fd1 + ld2;
        ld1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = ld2 > ld1;
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld1 = fd0 - fd1;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m3(ld2, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
        fb1 = lb3 || fb0;
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
    Output.points[8][3] -= fd0;
    ab2 = ab3 || ab4;
    fd1 *= -1;
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        double ld2 = 353.7103324577451;
        double ld3 = 470.58465730099596;
if(fo0 != null){
          ld2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        Thought lo4 = Thought4.getInstance(ld3, fd0, fd1, ld2);
        fb0 = ld3 > fd0;
        fb1 = lb1 && ab1;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1, lb5, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
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
    ad1 *= -1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    Output.points[8][4] += ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 865.1406407357778;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 371.8229401836651;
    fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld2 = 250.7862095108994;
if(fo0 != null){
      ld1 = fo0.m3(ld2, ad1, ad2, ad3);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(lb4, lb5, fb0, fb1);
}
    boolean lb6 = true;
    ld1 = ld2 - ad1;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return lb3;
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
    Thought lo0 = Thought66.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
    if (fb1) {
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
}
Thought.STACK_COUNTER++;
return ab3;
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
        fb1 = fb0 && fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd1 *= -1;
        fd0 = fd1 + fd0;
        double ld0 = 560.9618348697871;
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
if(ao3 != null){
          ao3.m1();
}
        Thought lo1 = Thought28.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        boolean lb2 = true;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
        lb2 = ld0 > fd0;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
    fb0 = fb1 || lb0;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb0 = ad3 < ad4;
    lb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[8][5] -= ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought88.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, lb2, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[8][6] += fd0;
    Output.points[8][7] -= fd1;
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 894.968068257325;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought30.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fb1 || ab1;
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = ld0 > fd0;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    lb0 = ad4 < fd0;
    Output.points[8][8] -= fd1;
    ad1 = ad2 + ad3;
    lb1 = !ab1;
    double ld2 = 535.9708869016957;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld2 < ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought60.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fb1 = !fb0;
    Thought lo1 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;
    Thought lo4 = Thought89.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb2);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fd0;
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought20.getInstance();
    Thought lo1 = Thought73.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    boolean lb3 = false;
    ab2 = fd1 < fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fd0;
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
    Output.points[0][0] += ad2;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought44.getInstance();
    fb1 = ad3 < ad4;
    Thought lo1 = Thought6.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    Output.points[0][1] += ad3;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    lb2 = !fb0;
    fb1 = ad1 < ad2;
    Thought lo3 = Thought16.getInstance(fo0, fo1, fo0, fo1);
    lb2 = ad3 > ad4;
    Output.points[0][2] -= fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    fd1 *= -1;
    double ld4 = 334.4331229624646;
    lb2 = ld4 > ad1;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fd1 = ld4 + ad1;
    Thought lo5 = Thought53.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}

Thought.STACK_COUNTER++;
return ad3;
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
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 > ad2;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao4.m2();
}

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    boolean lb2 = true;
if(ao3 != null){
      ad1 = ao3.m3(fb0, fb1, lb0, lb1);
}
    lb2 = !fb0;
    fb1 = !lb0;
    ad2 = ad3 + ad4;
    Output.points[0][3] -= fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ad4;
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought32.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = false;
    lb1 = !ab1;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > fd0;
    lb1 = fd1 > fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fd0;
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
    Thought lo0 = Thought94.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    Output.points[0][4] += ad4;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    fb0 = fb1 && ab1;
    ad3 = ad4 - fd0;
    ab2 = !ab3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Output.points[0][5] += fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 564.7162277989852;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 || fb0;
            }
        if (fb1) {
            boolean lb2 = false;
if(fo0 != null){
              lb2 = fo0.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
            for(int i2=0; i2<10; i2++){
if(fo1 != null){
                  fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
                  fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
                boolean lb3 = true;
if(fo0 != null){
                  fo1 = fo0.m4(lb2, fb0, fb1, lb3);
}
if(fo0 != null){
                  fo1 = fo0.m4();
}
if(fo1 != null){
                  fo1.m3(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb3);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
                lb2 = !fb0;
}}}
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
        ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought51.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    Output.points[0][6] -= fd0;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought21.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    lb0 = fd0 > fd1;
    lb2 = ab1 && ab2;
    fd0 = fd1 + fd0;
    Output.points[0][7] += fd1;
    fd0 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m2();
}
    if (ab3) {
        ab4 = fb0 && fb1;
        fd1 = fd0 - fd1;
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] += fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Output.points[1][0] += fd1;
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad3 > ad4;
    double ld0 = 660.2559810063788;
    boolean lb1 = true;
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    ad2 *= -1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
    ad3 = ad4 - fd0;
    Output.points[1][1] -= fd1;
    for(int i0=0; i0<10; i0++){
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    Output.points[1][2] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
        fb1 = !fb0;
    boolean lb0 = false;
    double ld1 = 733.7401179366678;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought96.getInstance(fd0, fd1, ld1, ad1);
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    lb0 = ad2 < ad3;
    fb0 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    double ld3 = 194.29689614479264;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    if (lb0) {
if(ao3 != null){
          ld1 = ao3.m3();
}
if(ao4 != null){
          fb0 = ao4.m2(ld3, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        boolean lb4 = true;
        Thought lo5 = Thought38.getInstance(fo0, fo1, ao1, ao2);
        lb4 = !lb0;
        double ld6 = 682.4245070794759;
        boolean lb7 = true;
        lb0 = ad3 < ad4;
        fb0 = fb1 && lb4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] += fd1;
    ab2 = !ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 < fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    boolean lb0 = true;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[1][4] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought46.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought27.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return ao4;
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
    ab1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    ad4 = fd0 + fd1;
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought54.getInstance(fo0, fo1, ao1, ao2);
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought72.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
if(ao1 != null){
      lb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
    double ld3 = 981.6978854374347;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ld3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought98.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
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
    Output.points[1][5] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;

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
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb1 = false;
    Output.points[1][6] -= fd1;
    lb0 = fd0 < fd1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought24.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    lb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    Output.points[1][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Output.points[1][8] -= fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    double ld4 = 270.62823575385397;
    double ld5 = 614.5874930212373;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld4);
}
    lb0 = ld5 > fd0;
    lb1 = lb3 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][0] += fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
        fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought85.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
}
