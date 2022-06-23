package genetic;
import java.util.ArrayList;
class Thought72 extends Thought{
private static ArrayList<Thought72> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 118.574530737597;
private double fd1 = 707.5287638993119;
private Thought fo0 = null;
private Thought fo1 = null;
Thought72 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought72 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought72 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld0 = 699.0577080019184;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[5][1] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld1 = 462.8266849007655;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
    fd1 *= -1;
    ld0 = ld1 + fd0;

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
    Output.points[5][2] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    Output.points[5][3] += fd1;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
        lb0 = fd0 < fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fd1 < fd0;
    Output.points[5][4] += fd1;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
    if (fb0) {
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
            fb0 = fb1 && fb0;
            Thought lo0 = Thought39.getInstance(ad1, ad2, ad3, ad4);
            boolean lb1 = false;
            double ld2 = 10.083521061651316;
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
            double ld3 = 104.08603944004052;
            double ld4 = 723.2785332290727;
            ld3 = ld4 - ad1;
if(fo1 != null){
              fo1.m2();
}
            } else if (fb0) {
if(fo0 != null){
              fo0.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
            fb1 = fb0 || fb1;
}}
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
    Thought lo0 = Thought55.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ab1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ad3 > ad4;
    ab2 = fd0 > fd1;
    Output.points[5][5] += ad1;
    ad2 = ad3 - ad4;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[5][6] -= fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    Output.points[5][7] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought3.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    lb0 = fb0 && fb1;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    lb2 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = fd0 < fd1;
    lb2 = lb3 && fb0;
    fb1 = lb0 || lb2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
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
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 > ad1;
    fb1 = fb0 || fb1;
    Output.points[5][8] -= ad2;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2();
}
    boolean lb2 = false;
    Thought lo3 = Thought95.getInstance(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
    lb0 = ad3 > ad4;
    Thought lo4 = Thought37.getInstance(fo0, fo1, ao1, ao2);
    double ld5 = 571.0193750354068;
    lb1 = ad4 > fd0;
    lb2 = fd1 > ld5;
    ad1 = ad2 - ad3;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought95.getInstance(lb0, ab1, ab2, ab3);
    Output.points[6][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab4 = fd0 > fd1;
    boolean lb2 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    if (fb0) {
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        if (fb1) {
            ab1 = ab2 && ab3;
            ab4 = ad1 > ad2;
            boolean lb0 = true;
            ab4 = fb0 && fb1;
            Output.points[6][1] += ad3;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
            ab4 = ad2 > ad3;
            Thought lo1 = Thought31.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
            ab2 = ab3 && ab4;
            fb0 = fb1 && lb0;
            Output.points[6][2] += ad4;
            boolean lb2 = false;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            lb2 = ad1 > ad2;
if(ao1 != null){
              fo1 = ao1.m4(lb3, ab1, ab2, ab3);
}
            Output.points[6][3] -= ad3;
if(ao2 != null){
              ad4 = ao2.m3();
}
            ab4 = !fb0;
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    fd0 *= -1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought54.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
    Thought lo1 = Thought1.getInstance();
    if (ab1) {
        Output.points[6][4] += fd1;
        ab2 = !ab3;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < fd0;
        ab3 = fd1 < fd0;
        ab4 = fb0 && fb1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought38.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld4 = 704.2406640998604;
        Thought lo5 = Thought84.getInstance(ab3, ab4, fb0, fb1);
        lb3 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(ld4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && lb3;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    double ld0 = 2.8588062377571246;
    ad2 = ad3 + ad4;
        Output.points[6][5] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought75.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ad1;
    boolean lb2 = false;
    ad2 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][6] -= ad3;
    Thought lo3 = Thought82.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    boolean lb4 = false;
    lb4 = ad1 < ad2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Thought lo0 = Thought8.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !ab1;
    Output.points[6][7] -= fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought50.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought51.getInstance();
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;

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
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought13.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    double ld2 = 53.04874001072338;
    double ld3 = 133.9242925597864;
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad2 = ao3.m3();
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    Thought lo0 = Thought70.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fb1 = ad4 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    boolean lb1 = false;

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
    fd0 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 502.1229146323072;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab4 = fd0 > fd1;
    Thought lo2 = Thought57.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[6][8] += fd0;
    fd1 *= -1;
    Output.points[7][0] += ld1;
    ab3 = fd0 < fd1;
    ld1 = fd0 + fd1;
    double ld3 = 224.73910985638796;
    double ld4 = 654.7935589974192;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld3, ld4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ld1 - ld3;
    ld4 = fd0 - fd1;
    ld1 *= -1;
    ld3 *= -1;
if(fo0 != null){
      ld4 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = lb0 && ab1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld1, ld3);
}
        ld4 = fd0 - fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    ab1 = !ab2;
    double ld1 = 476.36217747505134;
    ab3 = ad3 > ad4;
    boolean lb2 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    double ld4 = 56.913484199219425;
    Thought lo5 = Thought8.getInstance();
    Thought lo6 = Thought79.getInstance(ad1, ad2, ad3, ad4, lb0, lb2, lb3, ab1);
    boolean lb7 = false;
    double ld8 = 153.75292889674088;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ad4 > fd0;
        ab2 = fd1 < ld1;
        for(int i1=0; i1<10; i1++){
            Output.points[7][1] += ld4;
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, ld8, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, lb0, lb2, lb3, lb7);
}
if(fo1 != null){
              ad4 = fo1.m3(fd0, fd1, ld1, ld4);
}
            ab1 = ld8 < ad1;
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
            boolean lb9 = false;
}}
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
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][2] -= fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[7][3] += fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        lb0 = fd1 < fd0;
        fb0 = fb1 || lb0;
        Thought lo1 = Thought6.getInstance(fo0, fo1, fo0, fo1);
        if (fb0) {
}}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][4] -= fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    double ld0 = 839.7980300511866;
    Output.points[7][5] += fd0;
    fd1 = ld0 + fd0;

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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought72.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 108.08402897667376;
    double ld3 = 608.7880882034183;
    double ld4 = 110.73404395711783;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
return ld3;
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
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 982.75888815972;
    fb1 = fb0 || fb1;
    double ld1 = 266.74802181149886;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld0, ld1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ld0 *= -1;
    fb0 = ld1 < fd0;
    fd1 = ld0 - ld1;
    fd0 *= -1;
    fb1 = lb2 || fb0;
    fb1 = !lb2;
    fb0 = fd1 < ld0;
    ld1 *= -1;
    fd0 = fd1 + ld0;
    fb1 = lb2 && fb0;
    fb1 = lb2 && fb0;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
return ld1;
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
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
        boolean lb0 = true;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    lb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = lb0 && lb1;
    Thought lo2 = Thought49.getInstance(fb0, fb1, lb0, lb1);
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    lb0 = ad1 > ad2;
    lb1 = fb0 || fb1;
    lb0 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought3.getInstance(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = true;
    Thought lo5 = Thought88.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, lb4, fb0, fb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, lb1, lb4, fb0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}

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
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 822.8967578955339;
    Thought lo1 = Thought7.getInstance();
    ld0 *= -1;
    fd0 = fd1 + ld0;
    Output.points[7][6] -= fd0;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb2, ab1);
}
    ld0 = fd0 + fd1;
    ab2 = ld0 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    ld0 = fd0 - fd1;
    lb2 = ld0 < fd0;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    double ld0 = 593.0798130024095;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ao4.m3();
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb1, lb1, lb2, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld3 = 938.2180050062234;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        ad3 *= -1;
        ab4 = fb0 && fb1;
        ad4 = fd0 + fd1;
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought42.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought47.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld2 = 507.57781467131986;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    ld2 = fd0 - fd1;

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
    double ld0 = 969.0318971942911;
    ld0 = fd0 + fd1;
    ab1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] += fd1;
    Output.points[7][8] += ld0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought73.getInstance();
    fb0 = !fb1;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    Output.points[8][0] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb2, fb0, fb1);
}
    Output.points[8][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    Output.points[8][2] += ad3;
    double ld3 = 29.981026575442634;
        lb0 = ad3 > ad4;
    fd0 = fd1 - ld3;
    double ld4 = 784.3816425732176;
    lb2 = !fb0;
    Thought lo5 = Thought22.getInstance(ld4, ad1, ad2, ad3);
    Thought lo6 = Thought19.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
    ld4 = ad1 + ad2;
    fb1 = lb0 || lb2;
    if (fb0) {
        Thought lo7 = Thought89.getInstance(fb1, lb0, lb2, fb0);
        boolean lb8 = true;
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
    ab2 = ad1 < ad2;
    if (ab3) {
        ab4 = ad3 > ad4;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        Output.points[8][3] += ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought11.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        Thought lo1 = Thought92.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          ad4 = fo1.m3();
}
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
        fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][4] -= fd1;
    double ld0 = 765.8268500167993;
    fb1 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        double ld1 = 249.96782929753826;
        fb1 = fb0 && fb1;
        fd0 = fd1 - ld1;
        fb0 = ld0 > fd0;
        fd1 = ld1 + ld0;
        double ld2 = 212.4873465445593;
        fb1 = ld0 > fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        Output.points[8][5] -= ld1;
        fb0 = ld2 < ld0;
        fb1 = fd0 < fd1;
        Output.points[8][6] -= ld1;
        fb0 = ld2 < ld0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, ld2);
}
        Output.points[8][7] -= ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2);
}
        boolean lb3 = false;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][8] += ad1;
    Output.points[0][0] -= ad2;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 < ad4;
        fb1 = fb0 || fb1;
        fd0 = fd1 + ad1;
if(ao2 != null){
          ao2.m3();
}
        boolean lb0 = false;
        Thought lo1 = Thought62.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
        boolean lb2 = true;
        fd1 = ad1 - ad2;
        ad3 *= -1;
        lb2 = !fb0;
        ad4 *= -1;
        Thought lo3 = Thought21.getInstance(ao3, ao4, fo0, fo1);
        fb1 = fd0 > fd1;
        lb0 = !lb2;
}
Thought.STACK_COUNTER++;
return ao1;
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
    fd0 = fd1 + fd0;
    Output.points[0][1] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought63.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb1 = false;
if(ao1 != null){
      ab4 = ao1.m2();
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought0.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    double ld3 = 1000.4120739187599;
    Thought lo4 = Thought22.getInstance(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb1, ab1);
    Thought lo5 = Thought81.getInstance(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld3, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld3, fd0, fd1);
}
    fb1 = !lb1;
if(fo1 != null){
      ld3 = fo1.m3(ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return ao1;
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
if(ao2 != null){
          ao2.m3();
}
    if (ab2) {
        double ld0 = 823.6568854033834;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        ab2 = ad1 < ad2;
        ab3 = ad3 > ad4;
        double ld1 = 250.8755475271567;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
        boolean lb2 = false;
        boolean lb3 = true;
        ld1 *= -1;
if(ao3 != null){
          ao3.m2(ad1, ad2, ad3, ad4);
}
        ab1 = ab2 || ab3;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1);
}
if(ao3 != null){
          ab4 = ao3.m2(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
return ao1;
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
    Thought lo0 = Thought68.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 357.82467219954;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought75.getInstance(fd1, ld1, fd0, fd1);
    fb0 = ld1 > fd0;
    fb1 = !lb2;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    boolean lb4 = false;
    lb2 = fd0 < fd1;
    lb4 = !fb0;
    boolean lb5 = false;
    boolean lb6 = true;
    ld1 = fd0 + fd1;
    lb6 = ld1 > fd0;
    fb0 = fd1 > ld1;
    fd0 *= -1;
        Output.points[0][2] += fd1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fb1, lb2, lb4, lb5);
}
    double ld7 = 854.6460065133513;
    double ld8 = 577.8238192683795;
    boolean lb9 = false;

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
    Thought lo0 = Thought44.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld1 = 906.1118486912361;
    Thought lo2 = Thought14.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd0 > fd1;
    ld1 = fd0 + fd1;
    boolean lb3 = false;
    Thought lo4 = Thought27.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3(lb3, fb0, fb1, lb3);
}
    Output.points[0][3] -= fd0;
    Thought lo5 = Thought37.getInstance();

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    Thought lo1 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    Output.points[0][4] += fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
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
}
